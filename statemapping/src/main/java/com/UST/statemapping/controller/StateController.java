package com.UST.statemapping.controller;

import com.UST.statemapping.entity.State;
import com.UST.statemapping.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/district")
public class StateController {
    @Autowired
    public StateService stateService;
    @GetMapping("/{state}")
    public State getAllSchedule(@PathVariable String state){
        return stateService.findBystate(state);
    }

}
