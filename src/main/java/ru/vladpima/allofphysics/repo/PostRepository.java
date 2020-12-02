package ru.vladpima.allofphysics.repo;

import org.springframework.data.repository.CrudRepository;
import ru.vladpima.allofphysics.models.Post;

public interface PostRepository extends CrudRepository<Post, Long> {
}
