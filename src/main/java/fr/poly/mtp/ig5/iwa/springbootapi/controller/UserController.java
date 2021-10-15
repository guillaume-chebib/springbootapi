package fr.poly.mtp.ig5.iwa.springbootapi.controller;

import fr.poly.mtp.ig5.iwa.springbootapi.entity.User;
import fr.poly.mtp.ig5.iwa.springbootapi.exceptions.NoUserFoundException;
import fr.poly.mtp.ig5.iwa.springbootapi.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    UserController(UserService userService) {
        this.userService = userService;
    }



    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAll();
    }

    @PostMapping("/users")
    User newUser(@RequestBody User newUser) {
        System.out.println(newUser);

        return userService.save(newUser);
    }

    @GetMapping("/users/{id}")
    public User getAUserById(@PathVariable Long id){
        return userService.getById(id).orElseThrow(() -> new NoUserFoundException(id));
    }
}
