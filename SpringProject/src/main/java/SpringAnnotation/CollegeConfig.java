package SpringAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfig {
    @Bean
    public College collegeBean()//collegeBean id
    {
       // College college=new College(principal());
        College college=new College();
        college.setPrincipal(new Principal());
        return college;
    }
    @Bean
    public Principal principal()
    {
        return new Principal();

    }
}
