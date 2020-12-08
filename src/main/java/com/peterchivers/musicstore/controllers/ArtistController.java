package com.peterchivers.musicstore.controllers;

import com.peterchivers.musicstore.repositories.ArtistRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/artists")
@Controller
public class ArtistController {
    private final ArtistRepository artistRepository;

    public ArtistController(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @RequestMapping({"", "/"})
    public String getArtists(Model model) {
        model.addAttribute("artistList", artistRepository.findAll());
        return "artists/index";
    }
}
