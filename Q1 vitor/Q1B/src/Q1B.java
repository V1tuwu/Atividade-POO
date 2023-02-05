import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q1B {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma data no formato MM/DD/YYYY:");
        String inputDate = sc.next();
        sc.close();
        SimpleDateFormat inputFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = inputFormat.parse(inputDate);
        SimpleDateFormat outputFormat = new SimpleDateFormat("MMMM dd, yyyy");
        System.out.println("Data no formato MMMM dd, yyyy: " + outputFormat.format(date));
    }
}