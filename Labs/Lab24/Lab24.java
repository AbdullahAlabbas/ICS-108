package Labs.Lab24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Lab24 
    {public static void main(String[] args) {
        TreeMap<String, TreeSet<Integer>> majors = new TreeMap<>();

        try (Scanner input = new Scanner(new File("s.txt"))) {
            while (input.hasNext()) {
                int id = input.nextInt();
                String major = input.next();
                TreeSet<Integer> ids = majors.computeIfAbsent(major, k -> new TreeSet<>());
                ids.add(id);}}
                 
            catch (FileNotFoundException e) {System.out.println("Error: file not found");}

        for (String major : majors.keySet()) {System.out.printf("%s: %s\n", major, majors.get(major));}}}

