# Cache

https://docs.spring.io/spring-framework/docs/current/reference/html/testing.html#testcontext-ctx-management-caching


## TestContextManager

- TestContextManager 생성할때 BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.createBootstrapContext(testClass) 을 통해 TestContextBootstrapper를 찾아온다.
- TestContext 생성하기 위해 SpringBootTestContextBootstrapper의 구현체를 통해 DefaultTestContext을 생성한다.
- DefaultTestContext을 생성할떄 MergedContextConfiguration 필요한데, AbstractTestContextBootstrapper.buildMergedContextConfiguration() 을 통해 생성한다.

## SpringBootTestContextBootstrapper : AbstractTestContextBootstrapper : TestContextBootstrapper

## MergedContextConfiguration

테스트 클래스와 모든 수퍼클래스에 선언된 병합된 컨텍스트 구성을 캡슐화합니다.

ContextConfiguration, ActiveProfiles, TestPropertySource, 

- getDifferentiatorPropertySourceProperty: TestContextBootstrapper name : true 형식이 들어간다.

## DefaultTestContext : TestContext 

- getApplicationContext() 호출시 cacheAwareContextLoaderDelegate을 통해 load하게 된다.

## DefaultCacheAwareContextLoaderDelegate: CacheAwareContextLoaderDelegate

- loadContext : ContextCache 를 통해 확인하고 없으면 loadContextInternal 호출한다.
- loadContextInternal : mergedContextConfiguration 설정파일을 통해 Application을 Load 한다. 





