class Animal {
    public void sound() {
        System.out.println("Animal make sound");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Dogs can Barks");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("cat can Meows");
    }
}

public class MethodOvrriding {
    
    public static void main(String[] args) {
        Animal ani1=new Dog();
        Animal ani2=new Cat();
        ani1.sound();
        ani2.sound();
    }

}