package apollo.exercises.ch07_inheritance;

public class AnimalRunner {
    public static void main(String[] args) {
      //  Animal animal = new Animal(20.5, "Male");

//        System.out.println(animal);

        Cat cat = new Cat(10.5,"Female",true);
        Cat cat1 = cat;
        System.out.println(cat);
        cat.speak();
        cat1.setLovesCatNip(true);
        System.out.println("Cat " + cat.isLovesCatNip());
        System.out.println("Cat1 " + cat1.isLovesCatNip());

        Dog dog = new Dog(0, null,true);
        System.out.println(dog);
        dog.speak();

//Can you hear me?

        Mouse mouse= new Mouse(50, "female");
   //     speak(animal);
        speak(dog);
        speak(cat);
        speak(mouse);
        System.out.println("===================");
        dog.command("Speak");
    }

    public static void speak(Animal animal) {
        animal.speak();
    }
}
