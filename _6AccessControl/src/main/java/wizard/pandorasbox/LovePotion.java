package wizard.pandorasbox;

public class LovePotion {                    // (4) Accessible outside package
    String potionName;
    public LovePotion(String name) { potionName = name; }
    public String toString()       { return potionName; }
}