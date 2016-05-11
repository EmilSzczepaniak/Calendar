import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Emil on 11.05.2016.
 */
public class Application  {
    static List<Events> eventsList = new ArrayList<Events>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        createEvent();
        for (Events event : eventsList
             ) {
            System.out.println(event);

        }

    }



    public static void createEvent(){
        String date;
        String time;
        String note;
        Events event = new Events();
        date = scanner.next();
        time = scanner.next();
        note = scanner.next();

        event.setDate(date);
        event.setTime(time);
        event.setNote(note);
        eventsList.add(new Events(date,time,note));

    }
}

