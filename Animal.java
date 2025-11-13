interface Animal {
    void eat();
}

interface Pet {
    void play();
}

class LivingBeing {
    void breathe() {
        System.out.println("Living beings can breathe");
    }
}

class Dog extends LivingBeing implements Animal, Pet {
    public void eat() {
        System.out.println("Dog eats food");
    }

    public void play() {
        System.out.println("Dog loves to play fetch");
    }
}

public class TestClassInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.breathe();   
        d.eat();       
        d.play();      
    }
}
