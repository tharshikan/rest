package tharshi.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController {

    @Autowired
//    JobService jobService;

    @GetMapping("/jobs")
    public String getJobs() {
        return "to be implemented";
    }
}
