package factory_patten.factory;

import factory_patten.animal.Animal;
import factory_patten.animal.Cat;
import factory_patten.animal.Dog;
import factory_patten.animal.Duck;

import java.util.Random;

public class RandomAnimalFactory implements IAnimal {
    @Override
    public Animal createAnimal() {
        Random random = new Random();
        int rd = random.nextInt(3);
        switch (rd) {
            case 0: {
                return new Cat();
            }
            case 1: {
                return new Dog();
            }
            case 2: {
                return new Duck();
            }
            default: {
                return null;
            }
        }
    }
}
