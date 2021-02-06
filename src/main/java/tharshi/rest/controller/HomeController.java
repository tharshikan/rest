package tharshi.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/hello")
    public String getHello(@RequestParam(value = "name") String name) {
        return "<H1>abbHellosjgjhg " + name + "</H1>";
    }


}
