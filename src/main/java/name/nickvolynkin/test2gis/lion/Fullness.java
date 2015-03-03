package main.java.name.nickvolynkin.test2gis.lion;

/**
* @author Nick Volynkin  nick.volynkin@gmail.com
*/
public enum Fullness {
    FULL {
        @Override public String toString() {
            return "full";
        }
    },
    HUNGRY {
        @Override public String toString() {
            return "hungry";
        }
    },
}
