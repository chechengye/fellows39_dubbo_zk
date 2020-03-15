package com.weichuang.ticket;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1、导入dubbo与zookeeper的相关依赖
 * 2、编写配置文件
 * 3、标记发布的服务类
 * 4、开启服务@EnableDubbo
 */
@SpringBootApplication
@EnableDubbo
public class ProviderTicketApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderTicketApplication.class, args);
	}

}
