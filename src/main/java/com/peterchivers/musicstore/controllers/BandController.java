package com.peterchivers.musicstore.controllers;

import com.peterchivers.musicstore.repositories.BandRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/bands")
@Controller
public class BandController {

    private final BandRepository bandRepository;

    public BandController(BandRepository bandRepository) {
        this.bandRepository = bandRepository;
    }

    @RequestMapping({"", "/"})
    public String getBands(Model model) {
        model.addAttribute("bandList", bandRepository.findAll());
        return "bands/index";
    }
}
