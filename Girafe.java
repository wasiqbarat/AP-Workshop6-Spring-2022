public class Girafe extends Mammal implements Prey{
    public String uniqueFeature;

    public Girafe(String name, int age, int runSpeed, String uniqueFeature) {
        super(name, age, runSpeed);
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
    public String getName() {
        return super.name;
    }
}
