package controlWork2;

import java.time.LocalTime;
import java.util.List;

public class CurrentChannelPrograms {
    public static void printCurrentChannelPrograms(List<Program> programs, String channel) {
        LocalTime currentTime = LocalTime.now();
        for (Program program : programs) {
            if (program.getChannel().equals(channel) && currentTime.getHour() == program.getTime().getHour() && currentTime.getMinute() == program.getTime().getMinutes()) {
                System.out.println(program.getChannel() + " " + program.getTime().getHour() + ":" + program.getTime().getMinutes() + " " + program.getName());
            }
        }
    }
}

