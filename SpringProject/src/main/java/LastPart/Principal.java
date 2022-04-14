package LastPart;

import org.springframework.stereotype.Component;

@Component
public class Principal {
    public void principalInfo() {
        System.out.println("Principal info");
    }

    private String principalName;
}
