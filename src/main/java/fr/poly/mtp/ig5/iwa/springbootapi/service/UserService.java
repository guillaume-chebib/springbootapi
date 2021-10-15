package fr.poly.mtp.ig5.iwa.springbootapi.service;

import fr.poly.mtp.ig5.iwa.springbootapi.entity.User;
import fr.poly.mtp.ig5.iwa.springbootapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public Optional<User> getById(long id) {
        return userRepository.findById(id);
    }

    public User save(User newUser) {
        return userRepository.save(newUser);
    }
}
