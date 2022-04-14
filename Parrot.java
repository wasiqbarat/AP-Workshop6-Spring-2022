public class Parrot extends Bird implements Prey{
    public String uniqueFeature;

    public Parrot(String name, int age, int flightAltitude, String uniqueFeature) {
        super(name, age, flightAltitude);
        this.uniqueFeature = uniqueFeature;
    }

    public String getUniqueFeature() {
        return uniqueFeature;
    }

    @Override
    public void show() {
        super.show();
        System.out.println(", \""  + uniqueFeature + "\"");
    }

    @Override
    public String getName() {
        return super.name;
    }
}
