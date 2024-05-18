package controlWork2;

import java.util.List;
import java.util.ArrayList;

public class ProgramsByName {
    public static List<Program> findProgramsByName(List<Program> programs, String name) {
        List<Program> foundPrograms = new ArrayList<>();
        for (Program program : programs) {
            if (program.getName().equals(name)) {
                foundPrograms.add(program);
            }
        }
        return foundPrograms;
    }
}
