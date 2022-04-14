package Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

    private Heart heart;
    //now by adding default constructor spring will be able to make
    // object of Human class but not able to inject dependency heart

    public Human(Heart heart) {
        this.heart = heart;
    }

    public Human() {
    }
    @Autowired
    @Qualifier("heartObject")
    public void setHeart(Heart heart) {
        this.heart = heart;
    }
    public void startPumping()
    {
        heart.pump();
        System.out.println(heart.getBeats());
    }


}
