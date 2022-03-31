package org.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer // 开启config服务
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
public class Config_Server_3344 {

	public static void main(String[] args) {
		SpringApplication.run(Config_Server_3344.class, args);
	}

}
