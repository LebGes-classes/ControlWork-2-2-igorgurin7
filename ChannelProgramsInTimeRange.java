package controlWork2;

import java.util.List;

public class ChannelProgramsInTimeRange {
    public static void printChannelProgramsInTimeRange(List<Program> programs, String channel, BroadcastsTime startTime, BroadcastsTime endTime) {
        for (Program program : programs) {
            if (program.getChannel().equals(channel) && program.getTime().between(startTime, endTime)) {
                System.out.println(program.getChannel() + " " + program.getTime().getHour() + ":" + program.getTime().getMinutes() + " " + program.getName());
            }
        }
    }
}

