package com.courier.guias_ms.controllers;

import com.courier.guias_ms.exceptions.GuideNotFoundException;
import com.courier.guias_ms.models.Guide;
import com.courier.guias_ms.repositories.GuideRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class GuideController {
    private final GuideRepository guideRepository;

    public GuideController(GuideRepository guideRepository) {
        this.guideRepository = guideRepository;
    }

    @GetMapping ("/guide/{idGuide}")
    Guide getGuide(@PathVariable String idGuide){
        return guideRepository.findById(idGuide).orElseThrow(() -> new GuideNotFoundException("No se encontro la guia: " + idGuide));
    }

    @PostMapping ("/guide")
    Guide newGuide(@RequestBody Guide guide){
        return guideRepository.save(guide);
    }
}
