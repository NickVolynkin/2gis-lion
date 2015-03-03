package main.java.name.nickvolynkin.test2gis.lion;

/**
 * Reactions describe transitions between states.
 * @author Nick Volynkin  nick.volynkin@gmail.com
 */
public enum Reaction {
    IGNORE_PREY(SavannahEvent.Antelope, Fullness.Full, LionAction.Sleep, Fullness.Hungry),
    HUNT_PREY(SavannahEvent.Antelope, Fullness.Hungry, LionAction.Eat, Fullness.Full),
    ESCAPE_FULL(SavannahEvent.Hunter, Fullness.Full, LionAction.Escape, Fullness.Hungry),
    ESCAPE_HUNGRY(SavannahEvent.Hunter, Fullness.Hungry, LionAction.Escape, Fullness.Hungry),
    TREE_FULL(SavannahEvent.Tree, Fullness.Full, LionAction.Watch, Fullness.Hungry),
    TREE_HUNGRY(SavannahEvent.Tree, Fullness.Hungry, LionAction.Sleep, Fullness.Hungry),
    ;

    public final Fullness initialState;
    public final SavannahEvent event;
    public final Fullness finalState;
    public final LionAction action;
//    public final LionAction[] actions;

    Reaction(
            final SavannahEvent event,
            final Fullness initialState,
            final LionAction action,
            final Fullness finalState
            //            ,final LionAction[] actions
    ) {
        this.initialState = initialState;
        this.event = event;
        this.finalState = finalState;
        this.action = action;
//        this.actions = actions;
    }
}


