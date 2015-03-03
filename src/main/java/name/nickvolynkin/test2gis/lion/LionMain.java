package main.java.name.nickvolynkin.test2gis.lion;

/**
 * @author Nick Volynkin  nick.volynkin@gmail.com
 */
public class LionMain {
    public static void main(String... args) {
        Lion lion = new Lion();
        //full
        lion.describe();
        lion.react(Event.TREE); //hungry
        lion.react(Event.HUNTER); //hungry
        lion.react(Event.ANTELOPE); //full
        lion.react(Event.HUNTER); //hungry
        lion.react(Event.TREE); //hungry
        lion.react(Event.ANTELOPE); //full
        lion.react(Event.ANTELOPE); //full
    }

}
