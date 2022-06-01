package com.github.hotire.springtest.context.cache;

import org.springframework.context.ApplicationContext;
import org.springframework.test.context.CacheAwareContextLoaderDelegate;
import org.springframework.test.context.MergedContextConfiguration;
import org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate;

/**
 * @see CacheAwareContextLoaderDelegate
 * @see DefaultCacheAwareContextLoaderDelegate
 */
public class CacheAwareContextLoaderDelegateCore {

    /**
     * @see DefaultCacheAwareContextLoaderDelegate#loadContext(MergedContextConfiguration)
     */
    public ApplicationContext loadContext(MergedContextConfiguration mergedContextConfiguration) {
        return null;
    }
}
