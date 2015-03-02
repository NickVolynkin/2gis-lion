package main.java.name.nickvolynkin.test2gis.lion;

/**
 * The automate actions.
 *
* @author Nick Volynkin  nick.volynkin@gmail.com
*/
public enum LionAction {
    Eat {
        public String action(SavannahEvent event) {
            return "The Lion eats the " + event;
        }
    },
    Sleep {
        @Override
        public String action(final SavannahEvent event) {
            return "The Lion sleeps near the " + event;
        }
    },
    Escape {
        @Override
        public String action(final SavannahEvent event) {
            return "The Lion escapes from the " + event;
        }
    },
    Watch {
        @Override
        public String action(final SavannahEvent event) {
            return "The Lion watches the " + event;
        }
    };

    public abstract String action(SavannahEvent event);
}
