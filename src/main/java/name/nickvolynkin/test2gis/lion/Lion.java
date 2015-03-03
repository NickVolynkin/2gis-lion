package main.java.name.nickvolynkin.test2gis.lion;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.EnumMap;

/**
 * The Lion state machine.
 *
 * @author Nick Volynkin  nick.volynkin@gmail.com
 */
public class Lion {


    private static EnumMap<Fullness, EnumMap<Event, Reaction>> reactions;

    static {
        reactions = new EnumMap<Fullness, EnumMap<Event, Reaction>>(Fullness.class);

        for (Fullness fullness : Fullness.values()) {
            EnumMap<Event, Reaction> reactionEnumMap = new EnumMap<Event, Reaction>(Event.class);
            reactions.put(fullness, reactionEnumMap);
        }

        for (Reaction reaction : Reaction.values()) {
            reactions.get(reaction.initialState).put(reaction.event, reaction);
        }

    }

    private Fullness fullness = Fullness.FULL;

    private InputStream input = System.in;
    private PrintStream output = System.out;

    public Lion() {
    }

    public

    /**
     * Lion constructor for testing purpose
     *
     * @param inputStream
     * @param printStream
     */
    Lion(
            final InputStream inputStream,
            final PrintStream printStream) {
        this();
        if (null != inputStream) {
            this.input = inputStream;
        }

        if (null != printStream) {
            this.output = printStream;
        }
    }

    public void react(final Event event) {
        Action[] actions = reactions.get(fullness).get(event).actions;
        for (Action action : actions) {
            action.perform(this, event);
        }
    }

    public void say(final String string) {
        output.println(string);
    }

    public void describe() {
        Action.DESCRIBE.perform(this, this.fullness);
    }

    public Fullness getFullness() {
        return fullness;
    }

    void setFullness(final Fullness fullness) {
        this.fullness = fullness;
    }

    @Override
    public String toString() {
        return "The Lion";
    }


}
