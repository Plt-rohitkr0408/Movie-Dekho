package com.example.MovieDekho.service.intface;

import com.example.MovieDekho.entity.Show;

import java.util.List;

public interface ShowServiceInterface {

    Show addShow(Show show);

    Show getShowById(Long id);
    List<Show> getShow();
    List<Show> getShowByScreenId(Long screenId);

}
