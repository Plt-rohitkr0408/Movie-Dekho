package com.example.MovieDekho.service.intface;

import com.example.MovieDekho.entity.Show;

import java.util.Date;
import java.util.List;

public interface ShowServiceInterface {

    Show addShow(Show show);
    Show getShowById(Long id);
    List<Show> getShow();
    List<Show> getShowByScreenId(Long screenId);
    List<Show> getShowByMovieId(Long movieId);
    List<Show> getShowByMovieAndDate(Long movieId, Date showDate);

}
