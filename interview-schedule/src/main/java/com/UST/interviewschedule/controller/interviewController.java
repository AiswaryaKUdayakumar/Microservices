package com.UST.interviewschedule.controller;

import com.UST.interviewschedule.entity.interview;
import com.UST.interviewschedule.service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/interview")
public class interviewController {
    @Autowired
    private InterviewService interviewservice;

    @PostMapping("/schedule")
    public interview addinterview(@RequestBody interview inter) {
        return interviewservice.adddetails(inter);
    }

    @GetMapping("/")
    public List<interview> getAllInterview(){
        return interviewservice.getAllinterview();
    }
    @GetMapping("/interviewer/{id}")
    public interview getInterviewById(@PathVariable Long id){
        return interviewservice.getAllinterviewById(id);
    }
}
