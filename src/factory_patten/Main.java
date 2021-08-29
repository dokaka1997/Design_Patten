package factory_patten;

import factory_patten.factory.BasicAnimalFactory;
import factory_patten.factory.IAnimal;
import factory_patten.factory.RandomAnimalFactory;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        IAnimal iAnimal;
        for (int i = 0; i < 5; i++) {
//            if (random.nextInt(2) == 1) {
                iAnimal = new BasicAnimalFactory();
//            }else {
//                iAnimal = new RandomAnimalFactory();
//            }
                iAnimal.createAnimal().name();
//            }
        }
    }
}
