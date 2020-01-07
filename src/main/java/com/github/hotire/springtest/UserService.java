package com.github.hotire.springtest;

import java.util.HashMap;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Getter
  private Map<String, Object> cache = new HashMap<>();
}
