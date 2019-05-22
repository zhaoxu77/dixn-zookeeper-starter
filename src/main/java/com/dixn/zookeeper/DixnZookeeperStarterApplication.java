package com.dixn.zookeeper;

import com.dixn.zookeeper.client.ZkClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DixnZookeeperStarterApplication {

    public static void main(String[] args) {
//        SpringApplication.run(DixnZookeeperStarterApplication.class, args);

        ApplicationContext context = SpringApplication.run(DixnZookeeperStarterApplication.class, args);
        ZkClient zkClient = context.getBean(ZkClient.class);
        zkClient.register();

    }

}
