package com.dixn.zookeeper.annotation;

import com.dixn.zookeeper.config.ZkConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(ZkConfiguration.class)
public @interface EnableZookeeperConfiguration {
}
