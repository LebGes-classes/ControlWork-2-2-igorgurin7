package controlWork2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortedPrograms {
    public static void printSortedPrograms(List<Program> programs) {
        Collections.sort(programs, Comparator.comparing(Program::getChannel).thenComparing(Program::getTime));
        for (Program program : programs) {
            System.out.println(program.getChannel() + " " + program.getTime().getHour() + ":" + program.getTime().getMinutes() + " " + program.getName());
        }
    }
}

