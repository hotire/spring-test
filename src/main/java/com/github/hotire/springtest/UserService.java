package com.github.hotire.springtest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import lombok.Getter;

@Service
public class UserService {

    @Getter
    private final Map<String, Object> cache = new HashMap<>();

    public User findById(Long id) {
        return null;
    }

    public UserService() {
        System.out.println("debug");
    }
}
