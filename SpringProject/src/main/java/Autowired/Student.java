package Autowired;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
    private String name;
    @Value("${student.hobby}")//for this setter method will not call
    private String hobby;
    private String coarse;

    public Student(String name, String hobby, String coarse) {
        this.name = name;
        this.hobby = hobby;
        this.coarse = coarse;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    @Value("Vinisha")
    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }
    //@Value("Singing")
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getCoarse() {
        return coarse;
    }
    @Value("${student.coarse}")
    public void setCoarse(String coarse) {
        this.coarse = coarse;
    }



}
