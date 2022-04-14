package SpringAnnotation;

import SpringAnnotation.College;
import SpringAnnotation.CollegeConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Server {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(CollegeConfig.class);
        SpringAnnotation.College college=context.getBean("collegeBean",SpringAnnotation.College.class);
        college.test();
        ((AnnotationConfigApplicationContext)context).close();
    }
}
