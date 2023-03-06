package com.ajax.springboot.searching;

import java.util.List;

import com.ajax.springboot.searching.models.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.core.ParameterizedTypeReference;


@Service
public class CommentService {

//  @Autowired
//  private RestTemplate restTemplate;

  public List<Comment> fetchDataFromExternalAPI() {
    String apiUrl = "https://jsonplaceholder.typicode.com/comments?postId=3";

    RestTemplate restTemplate= new RestTemplate();
    ResponseEntity<List<Comment>> responseEntity = restTemplate.exchange(apiUrl, HttpMethod.GET, null, new ParameterizedTypeReference<List<Comment>>() {});
    List<Comment> myObjects = responseEntity.getBody();
    return myObjects;
  }

}
