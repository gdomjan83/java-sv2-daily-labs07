package day02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MovieService {
    private List<Movie> movies = new ArrayList<>();

    public MovieService(Path path) {
        try  {
            for (String line: Files.readAllLines(path)) {
                movies.add(createMovie(line));
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file.");
        }
    }

    public List<Movie> getMovies() {
        return movies;
    }

    private Movie createMovie(String data) {
        String[] elements = data.trim().split(";");
        Movie movie = new Movie(elements[0], Integer.parseInt(elements[1]), elements[2]);
        return movie;
    }
}
