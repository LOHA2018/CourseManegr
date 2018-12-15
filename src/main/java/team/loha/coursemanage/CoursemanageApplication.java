package team.loha.coursemanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "team.loha.coursemanage.mapper")
@SpringBootApplication
public class CoursemanageApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoursemanageApplication.class, args);
    }
}
