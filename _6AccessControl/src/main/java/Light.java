class Light {
    // Instance variables:
    private int     noOfWatts;       // Wattage
    private boolean indicator;       // On or off
    private String  location;        // Placement

    public Light() {
    }

    public Light(int noOfWatts, boolean indicator, String location) {
        this.noOfWatts = noOfWatts;
        this.indicator = indicator;
        this.location = location;
    }

    // Instance methods:
    public void switchOn()  { indicator = true; }
    public void switchOff() { indicator = false; }
    public boolean isOn()   { return indicator; }

    @Override
    public String toString() {
        return "Light{" +
                "noOfWatts=" + noOfWatts +
                ", indicator=" + indicator +
                ", location='" + location + '\'' +
                '}';
    }

    public static Light duplicateLight(Light oldLight) {     // (1)
        Light newLight = new Light();
        newLight.noOfWatts = oldLight.noOfWatts;               // (2)
        newLight.indicator = oldLight.indicator;               // (3)
        newLight.location  = oldLight.location;                // (4)
        return newLight;
    }

    public static void main(String[] args) {
        Light oldLight = new Light(10, true, "oldLocation");
        Light newLight = Light.duplicateLight(oldLight);
        System.out.println(newLight);
    }
}