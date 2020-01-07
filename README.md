# spring-test

![logo](/doc/img/test.png)

Junit4 / Junit5 / Spring-Test .. 등 여러가지 테스트 학습 용도


## SpringFramework-Test

### DirtiesContext

Spring Test에서 어플리케이션 컨텍스트는 딱 한 개만 만들어지고 모든 테스트에서 공유해서 사용한다. 

따라서 어플리케이션 컨텍스트의 구성이나 상태를 테스트 내에서 변경하지 않는 것이 원칙이다. 

만약 변경해야 한다면 @DirtiesContext 어노테이션을 붙이면 어플리케이션 컨텍스트를 공유하지 않는다. 


- Class Level
The ClassMode options for a test class define when the context is reset
  - BEFORE_CLASS : Before current test class
  - BEFORE_EACH_TEST_METHOD : Before each test method in the current test class
  - AFTER_EACH_TEST_METHOD : After each test method in the current test class
  - AFTER_CLASS : After the current test class

- Method Level
The MethodMode options for an individual method define when the context is reset
  - BEFORE_METHOD : Before the current test method
  - AFTER_METHOD : After the current test method
