package main.java.name.nickvolynkin.test2gis.lion;

/**
 * The Lion state machine.
 * @author Nick Volynkin  nick.volynkin@gmail.com
 */
public class Lion {

    private Fullness fullness;

    public void react(Event event) {

    }


    public Fullness getFullness() {
        return fullness;
    }

    void setFullness(final Fullness fullness) {
        this.fullness = fullness;
    }
}
