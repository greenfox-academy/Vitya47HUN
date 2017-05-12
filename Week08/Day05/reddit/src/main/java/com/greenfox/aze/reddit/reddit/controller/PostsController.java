package com.greenfox.aze.reddit.reddit.controller;

import com.greenfox.aze.reddit.reddit.models.Post;
import com.greenfox.aze.reddit.reddit.models.Posts;
import com.greenfox.aze.reddit.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostsController {

  @Autowired
  PostRepository PostRepo;

  Posts postList = new Posts();

  @RequestMapping(value = "/posts",method = RequestMethod.GET)
  public Posts posts() {
    postList.setPosts(PostRepo.findAll());
    return postList;
  }

  @PostMapping(value = "/posts")
  public Posts addPost(@RequestBody Post post) {

    return postList;
  }


}
