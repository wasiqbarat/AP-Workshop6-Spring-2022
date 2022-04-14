public abstract class Mammal extends Animal {
    private int runSpeed;

    public Mammal(String name, int age, int runSpeed) {
        super(name, age);
        this.runSpeed = runSpeed;
    }

    public int getRunSpeed() {
        return runSpeed;
    }

    @Override
    public void show() {
        super.show();
        System.out.print(", Run speed:" + runSpeed);
    }
}
