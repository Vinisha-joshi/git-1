package SpringFrameworkCore;

public class Airtel implements Sim{
    private int id;
    private String phone;
    private Phones phones;

    public Phones getPhones() {
        return phones;
    }
    public void display()
    {
        phones.sell();
    }

    public void setPhones(Phones phones) {
        this.phones = phones;
    }

    public Airtel(String phone,int id,Phones phones) {
        this.phone = phone;
        this.id=id;
        this.phones=phones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    @Override
    public void calling() {
        System.out.println("Inside airtel calling");
    }
    public Airtel()
    {
        System.out.println("Inside airtel constructor");
    }

    @Override
    public void data() {
        System.out.println("Inside airtel data");
    }
}
