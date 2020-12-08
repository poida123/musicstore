package com.peterchivers.musicstore.controllers;

import com.peterchivers.musicstore.repositories.SongRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/songs")
@Controller
public class SongController {
    private final SongRepository songRepository;

    public SongController(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    @RequestMapping({"", "/"})
    public String getSongs(Model model) {
        model.addAttribute("songList", songRepository.findAll());
        return "songs/index";
    }
}
