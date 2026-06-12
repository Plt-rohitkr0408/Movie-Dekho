package com.example.MovieDekho.service;

import com.example.MovieDekho.entity.Show;
import com.example.MovieDekho.service.intface.ShowServiceInterface;

import java.util.Date;
import java.util.List;

public class ShowService  implements ShowServiceInterface {



    @Override
    public Show addShow(Show show) {
        return null;
    }

    @Override
    public Show getShowById(Long id) {
        return null;
    }

    @Override
    public List<Show> getShow() {
        return List.of();
    }

    @Override
    public List<Show> getShowByScreenId(Long screenId) {
        return List.of();
    }

    @Override
    public List<Show> getShowByMovieId(Long movieId) {
        return List.of();
    }

    @Override
    public List<Show> getShowByMovieAndDate(Long movieId, Date showDate) {
        return List.of();
    }
}
