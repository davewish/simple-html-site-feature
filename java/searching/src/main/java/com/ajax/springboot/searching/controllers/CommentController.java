package com.ajax.springboot.searching.controllers;

import java.util.List;

import com.ajax.springboot.searching.CommentService;
import com.ajax.springboot.searching.models.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CommentController {
@Autowired
private CommentService commentService;

  @GetMapping("/")
  public List<Comment > getComment() {
    return commentService.fetchDataFromExternalAPI();
  }

}
