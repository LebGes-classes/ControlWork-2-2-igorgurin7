package controlWork2;

public class BroadcastsTime implements Comparable<BroadcastsTime> {
    private byte hour;
    private byte minutes;

    public BroadcastsTime(byte hour, byte minutes) {
        this.hour = hour;
        this.minutes = minutes;
    }

    public byte getHour() {
        return hour;
    }

    public byte getMinutes() {
        return minutes;
    }

    public boolean after(BroadcastsTime t) {
        if (this.hour > t.hour) {
            return true;
        } else if (this.hour == t.hour && this.minutes > t.minutes) {
            return true;
        }
        return false;
    }

    public boolean before(BroadcastsTime t) {
        if (this.hour < t.hour) {
            return true;
        } else if (this.hour == t.hour && this.minutes < t.minutes) {
            return true;
        }
        return false;
    }

    public boolean between(BroadcastsTime t1, BroadcastsTime t2) {
        boolean b = this.after(t1) && this.before(t2);
        return b;
    }

    @Override
    public int compareTo(BroadcastsTime o) {
        if (this.hour != o.hour) {
            return Byte.compare(this.hour, o.hour);
        } else {
            return Byte.compare(this.minutes, o.minutes);
        }

    }
}
