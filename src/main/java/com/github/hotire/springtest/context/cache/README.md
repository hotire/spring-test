# Cache

https://docs.spring.io/spring-framework/docs/current/reference/html/testing.html#testcontext-ctx-management-caching


## TestContextManager

- TestContext 생성하기 위해 SpringBootTestContextBootstrapper을 통해 DefaultTestContext을 생성한다.
- DefaultTestContext을 생성할떄 MergedContextConfiguration 필요한데, AbstractTestContextBootstrapper.buildMergedContextConfiguration() 을 통해 생성한다.

## SpringBootTestContextBootstrapper : AbstractTestContextBootstrapper : TestContextBootstrapper

## MergedContextConfiguration

## DefaultTestContext : TestContext 

- getApplicationContext() 호출시 cacheAwareContextLoaderDelegate을 통해 load하게 된다.

## CacheAwareContextLoaderDelegate



