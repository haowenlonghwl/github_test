package cn.baizhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("cn.baizhi.dao")
@SpringBootApplication
public class  YxApplication {
    public static void main(String[] args) {
        SpringApplication.run(YxApplication.class, args);
    }
}
