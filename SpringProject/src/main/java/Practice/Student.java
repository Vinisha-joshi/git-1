package Practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Autowired
    //@Qualifier("mathTeacher")
    private Teacher teach;

    public void test()
    {
        System.out.println("Inside student");
        teach.teach();
    }
}
