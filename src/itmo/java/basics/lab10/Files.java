package itmo.java.basics.lab10;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Files {

    public static List<String> readAsLines (File file) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return lines;
    }

    public static void addLineToFile (File file, String line) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {

            writer.write("\n" + line);

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void twoFilesAsOne (File file1, File file2) {
        List<String> lines = readAsLines(file2);
        for (String line : lines) {
            addLineToFile(file1, line);
        }
    }

    public static void replace (File inputFile, File outputFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.replace("[^a-zA-Z0-9]", "$"));
                writer.newLine();
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
