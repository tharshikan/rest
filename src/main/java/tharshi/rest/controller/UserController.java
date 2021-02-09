package tharshi.rest.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tharshi.rest.entities.User;
import tharshi.rest.repository.UserRepository;

import java.util.Optional;

@Slf4j
@RestController
@RequestMapping(path = "/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping(path="/add")
    public User addProject(@RequestParam String name, @RequestParam String email) {
        log.info("adding new usersss");
        User n = new User();
        n.setName(name);
        n.setEmail(email);
        User newUser = userRepository.save(n);
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
