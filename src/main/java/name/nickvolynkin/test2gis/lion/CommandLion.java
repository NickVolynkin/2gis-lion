package main.java.name.nickvolynkin.test2gis.lion;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Command line controller for the {@link main.java.name.nickvolynkin.test2gis.lion.Lion}
 *
 * @author Nick Volynkin  nick.volynkin@gmail.com
 */
public class CommandLion {

    private enum Command {
        HELP("help", "Show available commands") {
            @Override
            public void run() {
                System.out.println("\nYou can use the following commands:");
                for (Command command : Command.values()) {
                    System.out.println(command.describe());
                }
                System.out.println("\nOr choose one of the following objects for the Lion to meet:");
                for (Event event : Event.values()) {
                    System.out.println(event);
                }
            }


        },
        LION("lion", "Describe the Lion") {
            @Override
            public void run() {
                lion.describe();
            }
        },
        EXIT("exit", "Exit the application") {
            @Override
            public void run() {
                exit = true;
            }
        },;

        private final String name;
        private final String description;

        Command(
                final String name,
                final String description) {
            this.name = name;
            this.description = description;
        }

        public String toString() {
            return name;
        }

        public abstract void run();

        public String describe() {
            return name + "\t\t" + description;
        }
    }

    private static boolean exit = false;
    private static Lion lion;

    private static HashMap<String, Command> commands = new HashMap<>();

    static {
        for (Command command : Command.values()) {
            commands.put(command.toString().toLowerCase(), command);
        }
    }

    private static HashMap<String, Event> events = new HashMap<>();
    static {
        for (Event event: Event.values()) {
            events.put(event.toString().toLowerCase(), event);
        }
    }

    public static void main(String... args) {

        Scanner input = new Scanner(System.in);

        lion = new Lion();

        Command.HELP.run();

        while (!exit) {
            String cmdString = input.nextLine().toLowerCase();
            Command cmd = commands.get(cmdString);
            if (null != cmd) {
                cmd.run();
            }else {
                Event event = events.get(cmdString);
                if (null != event) {
                    lion.react(event);
                } else {
                    //command unrecognized
                    System.out.println("no such command");
                    Command.HELP.run();
                }
            }
        }
    }

}
