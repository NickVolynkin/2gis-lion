package main.java.name.nickvolynkin.test2gis.lion;

/**
 * Reactions describe transitions between Lion's states.
 *
 * @author Nick Volynkin  nick.volynkin@gmail.com
 */
enum Reaction {
    IGNORE_PREY(Event.ANTELOPE, Fullness.FULL, Action.SLEEP, Action.GET_HUNGRY),
    HUNT_PREY(Event.ANTELOPE, Fullness.HUNGRY, Action.EAT, Action.GET_FULL),
    ESCAPE_FULL(Event.HUNTER, Fullness.FULL, Action.ESCAPE, Action.GET_HUNGRY),
    ESCAPE_HUNGRY(Event.HUNTER, Fullness.HUNGRY, Action.ESCAPE),
    TREE_FULL(Event.TREE, Fullness.FULL, Action.WATCH, Action.GET_HUNGRY),
    TREE_HUNGRY(Event.TREE, Fullness.HUNGRY, Action.SLEEP);

    final Fullness initialState;
    final Event event;
    final Action[] actions;

    /**
     * @param event
     *         invoking event
     * @param fullness
     *         required fullness
     * @param actions
     *         optional: action(s) to perform
     */
    Reaction(
            final Event event,
            final Fullness fullness,
            final Action... actions
    ) {
        this.initialState = fullness;
        this.event = event;
        this.actions = actions;
    }
}


