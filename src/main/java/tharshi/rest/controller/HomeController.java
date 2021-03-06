package tharshi.rest.controller;


import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import tharshi.rest.model.GithubUser;

@RestController
public class HomeController {
    @Autowired
    Logger log;

    String URL = "https://api.github.com/user/";

    @GetMapping("/hello")
    public String getHello(@RequestParam(value = "name") String name) {
        var a = 2;
        return "<H1>Hello 22ss" + name + "</H1>";
    }

    @GetMapping("/user/{id}")
    public String getUsers(@PathVariable(value = "id") int id) {
        log.info("get users called");
        var restTemplate = new RestTemplate();
        var url = URL + id;
        var user = restTemplate.getForObject(url, GithubUser.class);
        return user.toString();


    }


}
