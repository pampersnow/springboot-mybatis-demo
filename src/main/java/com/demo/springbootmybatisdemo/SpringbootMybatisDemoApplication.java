package com.demo.springbootmybatisdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*/**
 *功能描述
 * @author jyb
 * @type SpringBoot工程启动类
 * @param
 */
@SpringBootApplication
//将项目中对应的mapper类的路径加进来就可以了
// 这个注解非常的关键，这个对应了项目中mapper（dao）所对应的包路径，这里忘了加会导致启动异常
@MapperScan("com.demo.springbootmybatisdemo.mapper")
public class SpringbootMybatisDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisDemoApplication.class, args);
    }
}
