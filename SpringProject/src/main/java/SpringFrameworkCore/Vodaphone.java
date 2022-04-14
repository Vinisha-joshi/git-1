package SpringFrameworkCore;

public class Vodaphone implements Sim {
    private Phones phones;

    public void setPhones(Phones phones) {
        this.phones = phones;
    }
    public void display()
    {
        phones.sell();
    }


    @Override
    public void calling() {
        System.out.println("inside vodafone calling");
    }

    @Override
    public void data() {
        System.out.println("inside vodafone data");
    }
}
