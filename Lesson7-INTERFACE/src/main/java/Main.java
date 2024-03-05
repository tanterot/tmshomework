import interf.Voice;
import impl.Cat;
import impl.Dog;
import abstr.*;

public class Main {
    public static void main(String[] args) {
//объекты от интерфейса
        Voice cat = new Cat();
        Voice dog = new Dog();
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();

        cat1.doVoice();
        cat.doVoice();
        dog.doVoice();
        dog1.doVoice();
//объекты от обстактного класса
        Hp hp = new Hp();
        Mac mac = new Mac();

        hp.getClassName();
        mac.getClassName();


    }
}
