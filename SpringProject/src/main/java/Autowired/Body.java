package Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {
    public static void main(String[] args) {
//        ApplicationContext context=new ClassPathXmlApplicationContext("Bean3.xml");
//        Human human=context.getBean("human",Human.class);
//        human.startPumping();
//        Student  student=context.getBean("student",Student.class);
//        System.out.println(student.getCoarse());
        ApplicationContext context=new AnnotationConfigApplicationContext(CollegeConfig.class);
        College college=context.getBean("collegeBean",College.class);
        System.out.println("Object of college created"+college);
    }
}
