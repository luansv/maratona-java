package jiraya.javacore.optional.repository;

import jiraya.javacore.optional.domain.Movie;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MovieRepository {
    public static void main(String[] args) {

    }
    public static List<Movie> movies = List.of(new Movie(01, "Im Still Here", 2024), new Movie(02, "Anora", 2024));

    public static Optional<Movie> findById(Integer id){
        return findBy(m -> m.getId().equals(id));
    }

    public static Optional<Movie> findByTitle(String title){
        return findBy(m -> m.getTitle().equals(title));
    }


    public static Optional<Movie> findBy(Predicate<Movie> predicate){
        Movie found = null;
        for (Movie movie : movies) {
            if (predicate.test(movie)){
                found = movie;
            }
        }
        return Optional.ofNullable(found);
    }
}

