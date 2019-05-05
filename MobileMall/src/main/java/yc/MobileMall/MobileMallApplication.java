package yc.MobileMall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages={"yc.MobileMall.dao"})   //扫描Mapper
public class MobileMallApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileMallApplication.class, args);
	}

}
