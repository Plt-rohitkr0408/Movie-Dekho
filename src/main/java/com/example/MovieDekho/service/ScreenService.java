package com.example.MovieDekho.service;

import com.example.MovieDekho.entity.Screen;
import com.example.MovieDekho.service.intface.ScreensServiceInterface;

import java.util.List;

public class ScreenService implements ScreensServiceInterface {
    @Override
    public Screen addScreen(Screen screen) {
        return null;
    }

    @Override
    public List<Screen> getScreens() {
        return List.of();
    }

    @Override
    public Screen getScreenById(Long id) {
        return null;
    }

    @Override
    public List<Screen> getScreensByTheaterId(Long theaterId) {
        return List.of();
    }
}
