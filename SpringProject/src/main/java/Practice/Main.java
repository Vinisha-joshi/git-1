package Practice;

import SpringAnnotation.CollegeConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class Main {
    public static void main(String[] args) {
        //ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        ApplicationContext context=SpringApplication.run(Main.class);
        Student student = context.getBean(Student.class);
        student.test();

    }
}