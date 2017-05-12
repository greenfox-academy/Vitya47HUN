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
  public Post addPost(@RequestBody Post post) {
  PostRepo.save(post);
  return post;
  }

  @PutMapping(value = "/posts/{id}/upvote")
  public Post putPost(@PathVariable("id") Long id) {
    Post post = PostRepo.findOne(id);
    PostRepo.findOne(id).addScore();
    PostRepo.save(post);
    return post;
  }

  @PutMapping(value = "/posts/{id}/downvote")
  public Post downPost(@PathVariable("id") Long id) {
    Post post = PostRepo.findOne(id);
    PostRepo.findOne(id).downScore();
    PostRepo.save(post);
    return post;
  }

  @DeleteMapping(value = "/posts/{id}")
  public Post deletePost(@PathVariable("id") Long id) {
    Post post = PostRepo.findOne(id);
    PostRepo.delete(post);
    return post;
  }

  @PutMapping(value = "/posts/{id}")
  public Post updatePost(@PathVariable("id") Long id,@RequestBody Post newPost) {
    Post post = PostRepo.findOne(id);
    post.setTitle(newPost.getTitle());
    post.setHref(newPost.getHref());
    PostRepo.save(post);
    return post;
  }

  @GetMapping(value = "/posts/{username}")
  public Posts userPosts(@PathVariable("username") String username) {
  postList.setPosts(PostRepo.findAllByUsername(username));
    return postList;
  }
}
