package com.example.MovieDekho.service;

import com.example.MovieDekho.entity.Screen;
import com.example.MovieDekho.respository.ScreenRepository;
import com.example.MovieDekho.service.intface.ScreensServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ScreenService implements ScreensServiceInterface {

    private final ScreenRepository  screenRepository;
    private final TheaterService theaterService;

    @Override
    public Screen addScreen(Screen screen) {
        return screenRepository.save(screen);
    }

    @Override
    public List<Screen> getScreens() {
        return screenRepository.findAll();
    }

    @Override
    public Screen getScreenById(Long id) {
        return screenRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Screen not found"));
    }

    @Override
    public List<Screen> getScreensByTheaterId(Long theaterId) {
        return screenRepository.findByTheaterId(theaterId);
    }
}
