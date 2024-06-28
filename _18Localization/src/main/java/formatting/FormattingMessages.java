package formatting;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.LocalTime;

public class FormattingMessages {
    public static void main(String[] args) {
        String pattern = "At {3} on {2} Elvis landed at {0} and was greeted by {1} fans.";
        String output = MessageFormat.format(pattern, "Honolulu", 3000,
                LocalDate.of(1961,3,25), LocalTime.of(12,15));
        System.out.println(output);

        // Specify the pattern:                                                       (1)
        String pattern2 = "At {3,time,short} on {2,date,medium} Elvis landed at {0} "
                +  "and was greeted by {1,number,integer} fans.";

// Create a MessageFormat based on the given pattern:                         (2)
        MessageFormat mf2 = new MessageFormat(pattern2);
        System.out.println("Local area: " + mf2.getLocale().getDisplayCountry());

// Create the array with the arguments to format:                             (3)
        Object[] messageArguments = {
                "Honolulu",                                         // argument index 0
                3000,                                               // argument index 1
                ConvertToLegacyDate.ldToDate(LocalDate.of(1961,3,25)),    // argument index 2
                ConvertToLegacyDate.ltToDate(LocalTime.of(12,15))         // argument index 3
        };

// Format the arguments:                                                      (4)
//        String output2 = mf2.format(messageArguments);
        String output2 = MessageFormat.format(pattern2, messageArguments);
        System.out.println(output2);
    }
}
