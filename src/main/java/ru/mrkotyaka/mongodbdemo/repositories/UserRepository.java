package ru.mrkotyaka.mongodbdemo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ru.mrkotyaka.mongodbdemo.models.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    User findByAge(int age);
    User findByName(String name);
}
