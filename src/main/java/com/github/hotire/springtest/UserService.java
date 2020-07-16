package com.github.hotire.springtest;

import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

  @Getter
  private Map<String, Object> cache = new HashMap<>();

  public User findById(Long id) {
      return null;
  }
}
