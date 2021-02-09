package tharshi.rest.controller;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tharshi.rest.entities.User;
import tharshi.rest.repository.UserRepository;

import java.util.Optional;

@RestController
@RequestMapping(path = "/users")
public class UserController {
    @Autowired
    Logger log;

    @Autowired
    UserRepository userRepository;

    @PostMapping("/add")
    public User addProject(@RequestBody User user) {
        log.info("adding new user");
        User newUser = userRepository.save(user);
        return newUser;

    }


    @GetMapping
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable(value = "id") int id) {
        Optional<User> userOptional = userRepository.findById(id);
        return userOptional.orElseThrow(() -> {
            throw new NullPointerException("kjk");
        });
    }
}
