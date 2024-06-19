import java.util.Locale;

public class FirstExample {
    public static void main(String[] args) {
        Locale aDefault = Locale.getDefault();
        System.out.println("Language: " + aDefault.getDisplayLanguage());
        System.out.println("Country: " + aDefault.getDisplayCountry());
        System.out.println("Name: " + aDefault.getDisplayName());
    }
}
