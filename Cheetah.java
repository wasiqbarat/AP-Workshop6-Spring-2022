public class Cheetah extends Mammal implements Hunter{
    private String uniqueFeature;

    public Cheetah(String name, int age, int runSpeed, String uniqueFeature) {
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
    public void hunt(Prey prey) {
        System.out.println(super.name + " hunted " + prey.getName());
    }
}
