package hu.nive.ujratervezes.zarovizsga.people;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class People {

    public int getNumberOfMales(String path) {
        try {
            return getSumOfMales(Files.readAllLines(Path.of(path)));
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read File!");
        }
    }

    private int getSumOfMales(List<String> lines) {
        return (int) lines.stream().filter(line -> "Male".equals(line.split(",")[4])).count();
    }
}
