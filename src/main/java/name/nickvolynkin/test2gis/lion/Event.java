package main.java.name.nickvolynkin.test2gis.lion;

/**
* @author Nick Volynkin  nick.volynkin@gmail.com
*/
public enum Event {
    HUNTER {
        @Override
        public String toString() {
            return "hunter";
        }
    },
    ANTELOPE {
        @Override
        public String toString(){
        return "antelope";
        }
    },
    TREE {
        @Override
        public String toString() {
            return "tree";
        }
    },
}
