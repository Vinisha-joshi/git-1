package SpringFrameworkCore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
//       // Airtel air= (Airtel) context.getBean("airtel");
//       // Airtel air=context.getBean("airtel",Airtel.class);
//       // air.calling();
////        Sim sim=context.getBean("sim",Sim.class);
////        sim.calling();
//        Airtel air=context.getBean("sim2",Airtel.class);
//       // air.getPhone();
//        System.out.println(air.getPhone());
//        System.out.println(air.getId());

//
        Phones phone=context.getBean("phones",Phones.class);
        phone.sell();
    }
}
