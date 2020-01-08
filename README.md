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

## JUnit5

### ParameterizedTest

인자 값을 다르게 전달하여 테스트하는 방법이다. 

- @ValueSource :  지정한 배열을 파라미터 값으로 순서대로 넘겨준다.

- @EnumSource : (열겨형) 값의 배열을 테스트 메서드에 전달한다.
  - names 속성 : 기본적으로 names 속성은 일치하는 enum 값을 가진다.

- @MethodSource : 복잡한 인수를 전달할 떄 사용하는 방법이다. 
  - Stream<Arguments> 와 같은 형태로 반환해야하며, static 단위이다. 
  
            
 
