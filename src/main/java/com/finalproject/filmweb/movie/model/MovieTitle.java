package com.finalproject.filmweb.movie.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MovieTitle {

    private String movieTitle;

    @Override
    public String toString() {
        return "MovieTitle{" +
                "movieTitle='" + movieTitle + '\'' +
                '}';
    }
}
