package formatting;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class FormattingDateTime {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(12, 30, 15, 99);
        String strTime = time.toString();                 // (1) 12:30:15.000000099
        LocalTime parsedTime = LocalTime.parse(strTime);  // (2)
        System.out.println(strTime +" : "+time.toString().equals(parsedTime.toString())); // true

        DateTimeFormatter df = DateTimeFormatter.ISO_LOCAL_DATE;     // (1)
        LocalDate date = LocalDate.of(1935, 1, 8);
        String strDate = date.format(df);                            // (2) 1935-01-08
        LocalDate parsedDate = LocalDate.parse(strDate, df);         // (3)
        System.out.println(strDate + "|" +
                parsedDate.format(df));          // (4) 1935-01-08|1935-01-08

        LocalDateTime dateTime = LocalDateTime.of(1935, 1, 8, 12, 45);
        String strDate2 = dateTime.format(df);                       // (4) 1935-01-08
        LocalDate parsedDate2 = LocalDate.parse(strDate2, df);       // (5) LocalDate

//        String timeStr2 = LocalTime.NOON.format(df);   // UnsupportedTemporalTypeException
//        LocalTime time2 = LocalTime.parse("12:00", df);// DateTimeParseException

        LocalTime time1 = LocalTime.of(14, 15, 30);             // 14:15:30
        LocalDate date1 = LocalDate.of(2021, 12, 1);            // 2021-12-01
        LocalDateTime dateTime1 = LocalDateTime.of(date1, time1); // 2021-12-01T14:15:30

        ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime1, ZoneId.of("US/Central"));
        System.out.println(zonedDateTime);// 2021-12-01T14:15:30-06:00[US/Central]

        DateTimeFormatter tff = DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL);
        String str4 = zonedDateTime.format(tff);  // Time part:
        System.out.println(str4);
        //   2:15:30 PM Central Standard Time
//        String str5 = time.format(tff);           // java.time.DateTimeException
//        String str6 = date.format(tff);           // java.time.temporal.
//        //      UnsupportedTemporalTypeException
//        String str7 = dateTime.format(tff);       // java.time.DateTimeException

        DateTimeFormatter df2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).localizedBy(Locale.ENGLISH);// (1)
        String inputStr = "2/29/21";                       // (2) en_US date, SHORT style
        LocalDate parsedDate3 = LocalDate.parse(inputStr, df2);    // (3)
        System.out.println(parsedDate3);                          // (4) 2021-02-28

        DateTimeFormatter dtff
                = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL)
                .localizedBy(Locale.FRANCE);          // (1)

// "mercredi 1 décembre 2021 à 14:15:30 heure normale du centre nord-américain"
        String charSeq = zonedDateTime.format(dtff);                 // (2)
        LocalTime pTime = LocalTime.parse(charSeq, dtff);            // (3) 14:15:30
        System.out.println(pTime);
        LocalDate pDate = LocalDate.parse(charSeq, dtff);            // (4) 2021-12-01
        System.out.println(pDate);

// 2021-12-01T14:15:30
        LocalDateTime pDateTime = LocalDateTime.parse(charSeq, dtff);         // (5)
        System.out.println(pDateTime);

// 2021-12-01T14:15:30-06:00[America/Chicago]
        ZonedDateTime pZonedDateTime = ZonedDateTime.parse(charSeq, dtff);    // (6)
        System.out.println(pZonedDateTime);
    }
}
