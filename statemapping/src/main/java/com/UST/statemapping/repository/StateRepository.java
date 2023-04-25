package com.UST.statemapping.repository;

import com.UST.statemapping.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State,String> {

    State findBystate(String state);
}
