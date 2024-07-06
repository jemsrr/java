import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class J63 {
    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss.SSS");
        String formatted = current.format((formatter));
        System.out.println(formatted);
    }
}
