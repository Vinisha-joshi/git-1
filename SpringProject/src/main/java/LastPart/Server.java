package LastPart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@PropertySource("classpath:student-info.properties")
public class Server {

    public static void main(String[] args) {/*
        College college = context.getBean(College.class);
        college.test();
        ((AnnotationConfigApplicationContext) context).close();*/

        ApplicationContext context = SpringApplication.run(Server.class, args);
        College college = context.getBean(College.class);
        college.test();
        System.out.println(college);
    }
}
