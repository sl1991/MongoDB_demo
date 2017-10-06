package dev.local.repository;

import dev.local.todo.Todo;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "todos", path = "todos")
public interface TodoRepository extends MongoRepository<Todo, String> {

    List<Todo> findByDescLike(@Param("desc") String desc);

    List<Todo> findByCompleted(@Param("completed") boolean completed);

    List<Todo> findByUserEmail(@Param("userEmail") String userEmail);
    // String类型有问题
    List<Todo> findByUserId(@Param("userId") ObjectId userId);

    List<Todo> findByUserIdAndDescLike(@Param("userId") ObjectId userId, @Param("desc") String desc);
}
