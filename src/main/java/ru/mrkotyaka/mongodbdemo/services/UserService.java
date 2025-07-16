package ru.mrkotyaka.mongodbdemo.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mrkotyaka.mongodbdemo.models.User;
import ru.mrkotyaka.mongodbdemo.repositories.UserRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUser(String id) {
        return userRepository.findById(id).orElse(null);
    }

    public User getUserByAge(int age) {
        return userRepository.findByAge(age);
    }

    public User getUserByName(String name) {
        return userRepository.findByName(name);
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }
}
