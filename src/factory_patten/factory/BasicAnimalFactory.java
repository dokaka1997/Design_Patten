package factory_patten.factory;

import factory_patten.animal.Animal;
import factory_patten.animal.Cat;
import factory_patten.animal.Dog;
import factory_patten.animal.Duck;

public class BasicAnimalFactory implements IAnimal {
    int index;

    @Override
    public Animal createAnimal() {

        switch (index) {
            case 0: {
                index++;
                return new Cat();
            }
            case 1: {
                index++;
                return new Dog();
            }
            case 2: {
                index = 0;
                return new Duck();
            }
        }
        return null;
    }
}
