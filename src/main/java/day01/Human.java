package day01;

import java.time.LocalDate;

public class Human {
    private String name;
    private int yearOfBirth;

    public Human(String name, int yearOfBirth) {
        if (name.trim().contains(" ")) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Enter a firstname and a lastname as well.");
        }
        if (LocalDate.now().getYear() - yearOfBirth > 120) {
            throw new IllegalArgumentException("Your age can't be higher than 120 years.");
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
