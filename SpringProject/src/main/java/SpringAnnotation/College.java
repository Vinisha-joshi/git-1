package SpringAnnotation;

public class College {
    public College(Principal principal) {
        this.principal = principal;
    }

    public College() {
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    private Principal principal;

    public void test()
    {
        principal.principalInfo();
        System.out.println("Testing this method");
    }
}
