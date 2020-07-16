package com.github.hotire.springtest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    public User findById(Long id) {
        return userService.findById(id);
    }
}
