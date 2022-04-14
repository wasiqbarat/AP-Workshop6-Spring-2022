public abstract class Animal {
    protected String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.print("name:" + name + ", Age:" + age);
    }
}
