package Autowired;

public class Heart {
    public int getBeats() {
        return beats;
    }

    public void setBeats(int beats) {
        this.beats = beats;
    }

    private int beats;
    public void pump()
    {
        System.out.println("Alive");
        System.out.println(beats);
    }
}
