package jiraya.javacore.optional.test;

import jiraya.javacore.optional.domain.Movie;
import jiraya.javacore.optional.repository.MovieRepository;

import java.util.List;
import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Movie> byId = MovieRepository.findById(01);
        byId.ifPresent(m -> m.setId(01));
        System.out.println(byId);

        Movie movieByTitle = MovieRepository.findByTitle("Anora")
                .orElseThrow(IllegalAccessError::new);
        System.out.println(movieByTitle);

        Movie movie = MovieRepository.findByTitle("Im Still Here")
                .orElse(new Movie(03, "Im Still Here", 2024));
        System.out.println(movie);
    }
}
