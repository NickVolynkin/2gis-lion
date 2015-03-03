package main.java.name.nickvolynkin.test2gis.lion;

/**
 * The automate actions.
 *
 * @author Nick Volynkin  nick.volynkin@gmail.com
 */
public enum Action {
    EAT(Constants.EATS_THE),
    SLEEP(Constants.SLEEPS_NEAR_THE),
    ESCAPE(Constants.ESCAPES_FROM_THE),
    WATCH(Constants.WATCHES_THE),
    GET_HUNGRY(Constants.GETS) {
        @Override
        public void perform(
                final Lion lion,
                final Object object) {
            super.perform(lion, Fullness.HUNGRY);
            lion.setFullness(Fullness.HUNGRY);
        }
    },
    GET_FULL(Constants.GETS) {
        @Override
        public void perform(
                final Lion lion,
                final Object object) {
            super.perform(lion, Fullness.FULL);
            lion.setFullness(Fullness.FULL);
        }
    },
    DESCRIBE(Constants.IS),
    ;

    Action(final String message) {
        this.message = message;
    }

    public void perform(
            final Lion lion,
            final Object object) {
        String actionMessage = new StringBuilder().append(lion).append(message).append(object).append(".").toString();
        lion.say(actionMessage);
    }

    private final String message;

    private static class Constants {

        public static final String EATS_THE = " eats the ";
        public static final String SLEEPS_NEAR_THE = " sleeps near the ";
        public static final String ESCAPES_FROM_THE = " escapes from the ";
        public static final String WATCHES_THE = " watches the ";
        public static final String GETS = " gets ";
        public static final String IS = " is ";
    }
}
