package day05_increment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Soru_Cozumu {
    public static void main(String[] args) {

       String date= LocalDate.parse("20014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date);

    }

}
