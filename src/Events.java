import java.sql.Time;
import java.time.LocalDate;

/**
 * Created by Emil on 11.05.2016.
 */
public class Events {
    String date;
    String time;
    String note;

    public Events(String date, String time, String note) {
        this.date = date;
        this.time = time;
        this.note = note;
    }

    public Events() {

    }

    @Override
    public String toString() {
        return "Events{" +
                "date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", note='" + note + '\'' +
                '}';
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}