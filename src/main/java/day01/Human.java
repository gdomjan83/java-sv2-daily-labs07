package day01;

import java.time.LocalDate;

public class Human {
    private String name;
    private int yearOfBirth;

    public Human(String name, int yearOfBirth) {
        if (isNameValid(name) && isYearValid(yearOfBirth)) {
            this.name = name;
            this.yearOfBirth = yearOfBirth;
        }
    }

    private boolean isYearValid(int yearOfBirth) {
        if (LocalDate.now().getYear() - yearOfBirth > 120) {
            throw new IllegalArgumentException("Your age can't be higher than 120 years.");
        }
        return true;
    }

    private boolean isNameValid(String name) {
        if (!(name != null && name.trim().contains(" "))) {
            throw new IllegalArgumentException("Enter a firstname and a lastname as well.");
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
