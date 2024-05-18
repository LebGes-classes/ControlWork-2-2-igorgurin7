package controlWork2;
import java.time.LocalTime;
import java.util.List;

public class ProgramsCurrent {
        public static void printProgramsCurrent(List<Program> programs) {
            LocalTime currentTime = LocalTime.now();
            for (Program program : programs) {
                if (currentTime.getHour() == program.getTime().getHour() && currentTime.getMinute() == program.getTime().getMinutes()) {
                    System.out.println(program.getChannel() + " " + program.getTime().getHour() + ":" + program.getTime().getMinutes() + " " + program.getName());
                }
            }
        }
}
