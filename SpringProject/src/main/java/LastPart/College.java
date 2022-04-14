package LastPart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
    @Value("${College.name}")
    private String collegeName;
    @Autowired
    private Principal principal;
    public College(Principal principal) {
        this.principal = principal;
    }

    public College() {
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public void test()
    {
        principal.principalInfo();
        System.out.println("Testing this method");
        System.out.println(collegeName);
    }
}
