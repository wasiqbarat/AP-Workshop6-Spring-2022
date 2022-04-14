import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        // instantiate animals
        Mammal girafe = new Girafe("girage", 50, 30, "it is very tall");
        Bird parrot = new Parrot("parrot", 10, 50, "it is very beautiful");
        Cheetah cheetah = new Cheetah("cheetah", 2, 100, "it is very fast");
        Eagle eagle = new Eagle("eagel", 1, 200, "powerful and alpha");

        animals.add(girafe);
        animals.add(parrot);
        animals.add(cheetah);
        animals.add(eagle);

        for (Animal animal : animals) {
            animal.show();
        }

    }
}
