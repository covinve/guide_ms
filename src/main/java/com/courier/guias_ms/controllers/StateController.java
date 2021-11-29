package com.courier.guias_ms.controllers;

import com.courier.guias_ms.exceptions.GuideNotFoundException;
import com.courier.guias_ms.models.Guide;
import com.courier.guias_ms.models.State;
import com.courier.guias_ms.repositories.GuideRepository;
import com.courier.guias_ms.repositories.StateRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class StateController {
    private final GuideRepository guideRepository;
    private final StateRepository stateRepository;

    public StateController(GuideRepository guideRepository, StateRepository stateRepository) {
        this.guideRepository = guideRepository;
        this.stateRepository = stateRepository;
    }

    @PostMapping("/state")
    State newState (@RequestBody State state) {
        Guide idGuide = guideRepository.findById(state.getIdGuide()).orElse(null);

        if (idGuide == null)
            throw new GuideNotFoundException("No es posible actualizar la guia :" + state.getIdGuide() + ". No existe");

        state.setDateState(new Date());
        return stateRepository.save(state);
    }

    @GetMapping("/state/{idGuide}")
    List<State> listState (@PathVariable String idGuide){
        Guide guide = guideRepository.findById(idGuide).orElse(null);
        if ( guide == null )
            throw new GuideNotFoundException("No se encontró la guia :" + idGuide);

        List<State> listGuidesFound = stateRepository.findStateByIdGuide(idGuide);
        return listGuidesFound;
    }
}
