public class Eagle extends Bird implements Hunter{
    public String uniqueFeature;

    public Eagle(String name, int age, int flightAltitude, String uniqueFeature) {
        super(name, age, flightAltitude);
        this.uniqueFeature = uniqueFeature;
    }

    public String getUniqueFeature() {
        return uniqueFeature;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Unique feature: " + uniqueFeature);
    }

    @Override
    public void hunt(Prey prey) {
        System.out.println(super.name + "hunted " + prey.getName());
    }
}
