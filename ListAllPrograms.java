package controlWork2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ListAllPrograms {
    public static List<Program> getAllPrograms(Map<BroadcastsTime, List<Program>> programMap) { // 4 пункт
        List<Program> allPrograms = new ArrayList<>();
        for (List<Program> programs : programMap.values()) {
            allPrograms.addAll(programs);
        }
        return allPrograms;
    }
}
