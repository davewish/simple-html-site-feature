package com.ajax.springboot.searching.models;


import java.util.Objects;

public class Comment {
  int id;
  String postId;

  public Comment() {

  }

  public Comment(int id, String postId, String name, String email, String body) {
    this.id = id;
    this.postId = postId;
    this.name = name;
    this.email = email;
    this.body = body;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Comment comment)) {
      return false;
    }
    return id == comment.id && Objects.equals(postId, comment.postId)
        && Objects.equals(name, comment.name) && Objects.equals(email,
        comment.email) && Objects.equals(body, comment.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, postId, name, email, body);
  }

  public int getId() {
    return id;
  }

  public String getPostId() {
    return postId;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public String getBody() {
    return body;
  }

  String name;
  String email ;
  String body ;

}
