package com.devsuperior.aulaJPARepository.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.aulaJPARepository.Entities.User;
import com.devsuperior.aulaJPARepository.Repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    
    @Autowired
    UserRepository userRepository;

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
    List<User> result = userRepository.findAll();

    return ResponseEntity.ok(result);
}

}
