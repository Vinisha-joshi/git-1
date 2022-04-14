import LastPart.College;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Test {
    @Autowired
    College college;

    @org.junit.jupiter.api.Test
    public void test() {
        college.test();
    }
}
