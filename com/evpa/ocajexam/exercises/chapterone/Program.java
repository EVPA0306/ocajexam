package com.evpa.ocajexam.exercises.chapterone;

import java.io.Console;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.util.Locale.ITALY;

/**
 * Created by evgenypavlenko on 2/27/17.
 */
public class Program {
    public static void main(String...args) {
        if (args != null && args.length != 0) {
            Console console = System.console();
            if (console != null) {
                String str = console.readLine("\nEnter any word here: ");
                System.out.println(str);
            }
        }
        System.out.println(ITALY);

        try {
            Files.walk(Paths.get("/Users/evgenypavlenko/Projects/ocajexam/logs")).forEach(p -> {
                if ( p.getFileName().toString().endsWith(".txt")) {
                    System.out.println(p.getFileName());
                }
            });
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
