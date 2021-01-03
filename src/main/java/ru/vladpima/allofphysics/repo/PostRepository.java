package ru.vladpima.allofphysics.repo;

import org.hibernate.resource.beans.container.spi.BeanLifecycleStrategy;
import org.springframework.data.repository.CrudRepository;
import ru.vladpima.allofphysics.models.Post;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, Long> {
    List<Post> findAllByOrderByIdAsc();
}
