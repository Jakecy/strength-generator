package io.strength;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

//http://velocity.apache.org/engine/1.7/user-guide.html#foreach-loop
@SpringBootApplication(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
@MapperScan("io.strength.dao")
public class StrengthApplication {

	public static void main(String[] args) {
		SpringApplication.run(StrengthApplication.class, args);
	}
}
