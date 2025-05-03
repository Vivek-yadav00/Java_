import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("Current Date and Time: " + dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String myDate = dt.format(df);
        System.out.println("Formatted Date: " + myDate);
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String myDate2 = dt.format(df2);
        System.out.println("Formatted Date (ISO): " + myDate2);
    }
}
