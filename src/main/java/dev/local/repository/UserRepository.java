package dev.local.repository;

import dev.local.todo.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository  extends MongoRepository<User, String> {
    User findByUsername(@Param("username") String username);
}
