package com.github.hotire.springtest;

import lombok.Data;

@Data
public class User extends Entity {
  private String name;
  private Integer age;
}
