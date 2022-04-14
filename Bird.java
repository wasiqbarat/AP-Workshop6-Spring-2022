public abstract class Bird extends Animal {
    private int flightAltitude;

    public Bird(String name, int age, int flightAltitude) {
        super(name, age);
        this.flightAltitude = flightAltitude;
    }

    public int getFlightAltitude() {
        return flightAltitude;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Flight altitude: " + flightAltitude);
    }
}
