package com.mao.leaf;

import com.tencent.devops.leaf.plugin.annotation.EnableLeafServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableLeafServer
@SpringBootApplication
public class LeafApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeafApplication.class, args);
    }

}
