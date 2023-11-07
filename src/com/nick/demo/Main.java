package com.nick.demo;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {

        // VARIABLES
        String osName = System.getProperty("os.name").toLowerCase();
        String osNameOneWord = osName.substring(0, osName.indexOf(' '));
        String user = System.getProperty("user.name");

        // DEBUGGING
        System.out.println(osName);
        System.out.println(osNameOneWord);
        System.out.println(user);

        switch (osNameOneWord){
            case "windows" -> System.out.println("Running on Windows");

            default -> System.out.println("Unknown OS");
        }

        try (
            Writer writer = new BufferedWriter(
                            new OutputStreamWriter(
                            new FileOutputStream("minFil.txt"), StandardCharsets.UTF_8)
            )
        )

        {

            int age = 5;
            String name = "Benny ";

            System.out.println("Inside text-writer");

            writer.write(name + age);

        } catch (IOException e) {
            // handle me
        }



    }
}
