package life.majiang.community;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// 新增 @MapperScan 注解，指定扫描 Mapper 接口的包
@MapperScan("life.majiang.mapper")
public class CommunityApplication {
//
	public static void main(String[] args) {
		SpringApplication.run(CommunityApplication.class, args);
	}

}
