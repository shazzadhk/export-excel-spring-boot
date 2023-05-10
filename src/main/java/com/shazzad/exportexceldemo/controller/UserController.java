package com.shazzad.exportexceldemo.controller;

import com.shazzad.exportexceldemo.entity.Users;

import com.shazzad.exportexceldemo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save-all")
    public ResponseEntity<List<Users>> saveAll(@RequestBody List<Users> usersList){
        return new ResponseEntity<>(this.userService.saveAllUser(usersList), HttpStatus.CREATED);
    }


}
