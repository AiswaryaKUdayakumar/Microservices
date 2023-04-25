package com.UST.statemapping.service;

import com.UST.statemapping.entity.State;
import com.UST.statemapping.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateService {
    @Autowired
    public StateRepository repo;

    public List<State> getDistricts() {
        return repo.findAll();
}
    public State findBystate(String state) {
        return repo.findBystate(state);
    }
}
