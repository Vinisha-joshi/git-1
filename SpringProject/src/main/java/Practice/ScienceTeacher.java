package Practice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ScienceTeacher implements Teacher{
    @Override
    public void teach() {
        System.out.println("Science Teacher");
    }
}
