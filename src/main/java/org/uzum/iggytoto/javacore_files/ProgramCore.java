package org.uzum.iggytoto.javacore_files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ProgramCore {

    public static void main(String[] args) throws IOException {
        try (FileOutputStream fos = new FileOutputStream("test.txt")) {
            fos.write("hello".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream("test.txt")) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.println((char) data);
            }
        }

        File directory = new File("testDir");
        if (!directory.exists()) {
            directory.mkdir();
        }

        if (directory.exists()) {
            directory.delete();
        }

        Path p = Paths.get("test.txt");

        List<String> dd = Files.readAllLines(p);

        for (var s : dd) {
            System.out.println(s);
        }
    }
}
