package com.peterchivers.musicstore.controllers;

import com.peterchivers.musicstore.repositories.GenreRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/genres")
@Controller
public class GenreController {
    private final GenreRepository genreRepository;

    public GenreController(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    @RequestMapping({"", "/"})
    public String getGenres(Model model) {
        model.addAttribute("genreList", genreRepository.findAll());
        return "genres/index";
    }
}
