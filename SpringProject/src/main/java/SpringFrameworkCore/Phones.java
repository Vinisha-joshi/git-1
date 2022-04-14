package SpringFrameworkCore;

public class Phones {
    public void setSim(Sim sim) {
        this.sim = sim;
    }

    private Sim sim;
    void sell()
    {

       sim.calling();
       sim.data();
    }

}
