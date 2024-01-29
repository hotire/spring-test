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

### RestClientTest 

Client-Slice-Test 다. 

https://www.baeldung.com/restclienttest-in-spring-boot 


## JUnit4

### @Before / @BeforeClass

- @Before : 테스트 마다 실행되기전에 실행

- @BeforeClass : 테스트 클래스 당 테스트 실행하기 전에 실행된다. (static)

### @After / @AfterClass

- @After : 테스트 마다 실행된 후 실행

- @AfterClass : 테스트 클래스 당 테스트 실행된 후 실행된다. (static)

### @Ignore

테스트를 실행하지 않는다.

## JUnit5

### ParameterizedTest

인자 값을 다르게 전달하여 테스트하는 방법이다. 

- @ValueSource : 지정한 배열을 파라미터 값으로 순서대로 넘겨준다.

- @EnumSource : (열겨형) 값의 배열을 테스트 메서드에 전달한다.
  - names 속성 : 기본적으로 names 속성은 일치하는 enum 값을 가진다.

- @MethodSource : 복잡한 인수를 전달할 떄 사용하는 방법이다. 
  - Stream<Arguments> 와 같은 형태로 반환해야하며, static 단위이다. 
  
- ArgumentsProvider : 해당 인터페이스를 implements 하면 custom provider 사용할 수 있다. 
  - annotation과 결합하여 사용도 가능하다. 
  

- Custom ArgumentsProvider / Annotation : https://blog.naver.com/gngh0101/221770700325


### @BeforeAll / @BeforeEach

- @BeforeAll : JUnit4 @Before와 동일한 기능으로 테스트 마다 실행되기 전 실행

- @BeforeEach : JUnit4 @BeforeClass와 동일한 기능으로 테스트 클래스 당 테스트 전에 실행된다. (static 이지만, Test Instance 전략 변경시 non static)


### @AfterAll / @AfterEach

- @AfterAll : JUnit4 @After와 동일한 기능으로 테스트 마다 실행된 후 실행

- @AfterEach : JUnit4 @AfterClass와 동일한 기능으로 테스트 클래스 당 테스트 후에 실행된다. (static 이지만, Test Instance 전략 변경시 non static)


### @TestInstance
              
기본 전략으로 JUnit4 / JUnit5 에서 각 테스트마다 instance를 생성한다. 

JUnit5에서는 @TestInstance를 통해 lifecycle를 제어할 수 있다. 
              
- @TestInstance(TestInstance.Lifecycle.PER_CLASS) : 사용시 Test instance를 하나만을 생성하고 재사용한다. 

@BeforeAll / @AfterAll non-static 사용 가능

### @Disabled

테스트를 실행하지 않는다.              
 
## Mockito

reference : https://javadoc.io/doc/org.mockito/mockito-core/latest/org/mockito/Mockito.html

### 3.5.0 Static Method, Object construction
- https://blog.naver.com/gngh0101/222211937470

### ArgumentCaptor

verification에만 사용하는 기능으로, 아규먼트를 저장해놓았다가 나중에 getValue할 수 있다. 


### Verify 

원하는 메서드가 특정 조건으로 실행되었는지를 검증한다. 

- verifyNoInteractions : mock 객체 전체의 메소드가 실행되지 않는 것을 검증한다. 


## Contribution

- Fix typo in Javadocs of MockedConstruction 
    - https://github.com/mockito/mockito/pull/2180
    - 3.7.8 release: https://github.com/mockito/mockito/releases/tag/v3.7.8

### Extension Getting Started

JUnit5에 추가된 Extension은 Test class, method을 확장할 수 있다.

https://blog.naver.com/gngh0101/222035710933


### Spring Extension 동작 원리 -1 (Store / ApplicationContex)

https://blog.naver.com/gngh0101/222039768109

### Spring Extension 동작 원리 -2(TestContextManager)

https://blog.naver.com/gngh0101/222054436000


## ArchUnit

https://github.com/TNG/ArchUnit
https://d2.naver.com/helloworld/9222129

## 기타 

### Baeldung JUnit
https://www.baeldung.com/junit

### Running JUnit Tests Programmatically, from a Java Application
- https://www.baeldung.com/junit-tests-run-programmatically-from-java


### Auto Params

- https://github.com/JavaUnit/AutoParams


### Mutation Testing with PITest

- https://www.baeldung.com/java-mutation-testing-with-pitest

### pitest-junit5-plugin

https://github.com/tobiasstadler/pitest-junit5-plugin


### unit-testing-best-practices

- https://docs.microsoft.com/ko-kr/dotnet/core/testing/unit-testing-best-practices

- https://blog.kingbbode.com/52


### 스프링캠프 2019 [Track 2 Session 3] : 무엇을 테스트할 것인가? 어떻게 테스트할 것인가? (권용근)

https://youtu.be/YdtknE_yPk4



## Test Double

- https://blog.cleancoder.com/uncle-bob/2014/05/14/TheLittleMocker.html

- https://martinfowler.com/bliki/TestDouble.html


- Dummy : (단순히 함수의 파라미터를 채우기 위한 용도) objects are passed around but never actually used. Usually they are just used to fill parameter lists.
- Fake : (실제 객체와 유사하게 동작) objects actually have working implementations, but usually take some shortcut which makes them not suitable for production (an InMemoryTestDatabase is a good example).
- Stubs : (테스트를 위해 동작을 조작) provide canned answers to calls made during the test, usually not responding at all to anything outside what's programmed in for the test.
- Spies : (내부의 동작을 외부에서 관찰)are stubs that also record some information based on how they were called. One form of this might be an email service that records how many messages it was sent.
- Mocks : (동작을 조작하고 검증까지)are pre-programmed with expectations which form a specification of the calls they are expected to receive. They can throw an exception if they receive a call they don't expect and are checked during verification to ensure they got all the calls they were expecting.


### Mock

when we are speaking informally the word mock is a synonym for Test Double.

long ago some very smart people wrote a paper that introduced and defined the term Mock Object. Lots of other people read it and started using that term. Other people, who hadn’t read the paper, heard the term and started using it with a broader meaning. They even turned the word into a *verb*. They’d say, “Let’s mock that object out.”, or “We’ve got a lot of mocking to do.”


# Release notes

## 5.8.0

- https://junit.org/junit5/docs/5.9.3/release-notes/#release-notes-5.8.0
