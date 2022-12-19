package com.study.v1.controller;

import com.study.domain.entity.User;
import com.study.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/{osPlatform}")
    public ResponseEntity<List<User>> getUsersByOsPlatform(@PathVariable User.OsPlatform osPlatform,
                                                           @PageableDefault Pageable pageable) {
        List<User> users = userService.searchByOsPlatform(osPlatform, pageable);
        return ResponseEntity.ok(users);
    }
}
