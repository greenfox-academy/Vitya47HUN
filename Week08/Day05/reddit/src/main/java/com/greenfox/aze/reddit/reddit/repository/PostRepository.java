package com.greenfox.aze.reddit.reddit.repository;

import com.greenfox.aze.reddit.reddit.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PostRepository extends CrudRepository<Post,Long> {

  public List<Post> findAllByUsername(String username);
}

