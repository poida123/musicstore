package com.peterchivers.musicstore.controllers;

import com.peterchivers.musicstore.repositories.AlbumRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/albums")
@Controller
public class AlbumController {
    private final AlbumRepository albumRepository;

    public AlbumController(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    @RequestMapping({"", "/"})
    public String listAlbums(Model model) {
        model.addAttribute("albumList", albumRepository.findAll());

        return "albums/index";
    }
}
