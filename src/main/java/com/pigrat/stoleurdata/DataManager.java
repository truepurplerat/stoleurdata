package com.pigrat.stoleurdata;

import java.io.*;
import java.util.ArrayList;

public class DataManager {
    public static final String PATH = "savedData.txt";

    public static void save(String toSave) {
        File file = new File(PATH);

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (Exception e) {
            System.err.println("Failed to create file");
        }

        try (FileWriter writer = new FileWriter(PATH)) {
            writer.write(toSave);

            System.out.println("Content has been written to the file.");
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }

    public static ArrayList<String> load() {
        try (BufferedReader reader = new BufferedReader(new FileReader(PATH))) {
            return new ArrayList<String>(reader.lines().toList());
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
        return null;
    }

    public static void saveUser(User toSave) {
        save(toSave.name+"\n"+toSave.age+"\n"+toSave.gender);
    }

    public static User loadUser() {
        var loaded = load();
        return new User(loaded.get(0), Integer.parseInt(loaded.get(1)), loaded.get(2));
    }
}
