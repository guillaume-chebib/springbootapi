package fr.poly.mtp.ig5.iwa.springbootapi.controller;

import fr.poly.mtp.ig5.iwa.springbootapi.entity.User;
import fr.poly.mtp.ig5.iwa.springbootapi.exceptions.NoUserFoundException;
import fr.poly.mtp.ig5.iwa.springbootapi.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    UserController(UserService userService) {
        this.userService = userService;
    }



    @GetMapping("/")
    public List<User> getAllUsers(){
        return userService.getAll();
    }


    @PostMapping("/")
    @ResponseStatus (HttpStatus.CREATED)
    User newUser(@RequestBody User newUser) {
        System.out.println(newUser);

        return userService.save(newUser);
    }

    @GetMapping("{id}")
    public User getAUserById(@PathVariable Long id){
        return userService.getById(id).orElseThrow(() -> new NoUserFoundException(id));
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        userService.delete(id);
    }

    @PutMapping("{id}")
    public User update(@PathVariable Long id, @RequestBody User user){
        User existingUser = userService.getById(id).orElseThrow(() -> new NoUserFoundException(id));
        BeanUtils.copyProperties(user,existingUser,"user_id");
        return userService.save(existingUser);
    }
}
