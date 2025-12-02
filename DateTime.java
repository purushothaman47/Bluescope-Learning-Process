package Example;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
public class DateTime {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime nowTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Today's Date: " + today);
        System.out.println("Current Time: " + nowTime);
        System.out.println("Current Date & Time: " + currentDateTime);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted Date-Time: " + formattedDateTime);

        LocalDate nextWeek = today.plusDays(7);
        LocalTime afterTwoHours = nowTime.plusHours(2);
        System.out.println("Date After 7 Days: " + nextWeek);
        System.out.println("Time After 2 Hours: " + afterTwoHours);

      

    }
}



