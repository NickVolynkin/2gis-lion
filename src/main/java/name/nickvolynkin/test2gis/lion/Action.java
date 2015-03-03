package main.java.name.nickvolynkin.test2gis.lion;

/**
 * The automate actions.
 *
 * @author Nick Volynkin  nick.volynkin@gmail.com
 */
public enum Action {
    EAT {
        public void perform(
                final Lion lion,
                final Event event) {
            System.out.println("The " + lion + " eats the " + event);
        }
    },
    SLEEP {
        @Override
        public void perform(
                final Lion lion,
                final Event event) {
            System.out.println("The " + lion + " sleeps near the " + event);
        }
    },
    ESCAPE {
        @Override
        public void perform(
                final Lion lion,
                final Event event) {
            System.out.println("The " + lion + " escapes from the " + event);
        }
    },
    WATCH {
        @Override
        public void perform(
                final Lion lion,
                final Event event) {
            System.out.println("The " + lion + " watches the " + event);
        }
    },
    GET_HUNGRY {
        @Override
        public void perform(
                final Lion lion,
                final Event event) {
            System.out.println("The " + lion + " gets hungry");
            lion.setFullness(Fullness.HUNGRY);
        }
    },
    GET_FULL {
        @Override
        public void perform(
                final Lion lion,
                final Event event) {
            System.out.println("The " + lion + " gets full");
            lion.setFullness(Fullness.FULL);
        }
    };


    public abstract void perform(
            final Lion lion,
            Event event);
}
