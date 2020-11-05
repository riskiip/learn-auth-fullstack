package com.backend.auth.api;

import com.backend.auth.model.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

    @GetMapping("/")
    public String login() {
        return "Congrats! Your authentication has been successfuly";
    }

    @GetMapping("/getUsers")
    public List<User> getUsers() {
        return Stream.of(
                new User(1, "Muhammad Rizki", "muhamadrizki19@gmail.com", "082220463884"),
                new User(1, "Muhammad Rizki", "muhamadrizki19@gmail.com", "082220463884"),
                new User(1, "Muhammad Rizki", "muhamadrizki19@gmail.com", "082220463884")
        ).collect(Collectors.toList());
    }
}
