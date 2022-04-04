package lession_09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab9 {
    /**
     * Racing animal with builder design pattern (adding attribute flyable)
     * Eagle, Falcon, Tiger, Snake....
     * Animal tiger = new Animal.Builder().whithWings(false).....build();
     * Animal falcon = new Animal.Builder().whithWings(true).....build();
     */

    public static void main(String[] args) {
        Animal eagle = new Animal.Builder().withName("Eagle").withMaxSpeed(70).withWings(true).build();
        Animal falcon = new Animal.Builder().withName("Falcon").withMaxSpeed(85).withWings(true).build();
        Animal tiger = new Animal.Builder().withName("Tiger").withMaxSpeed(100).withWings(false).build();
        Animal snake = new Animal.Builder().withName("Snake").withMaxSpeed(60).withWings(false).build();

        Animal winner = getWinner(Arrays.asList(eagle, falcon, tiger, snake));
        System.out.println("Winner is " + winner.getName() + " with speed: " + winner.getSpeed());

    }

    public static Animal getWinner(List<Animal> animalList){
        if (animalList == null || animalList.isEmpty()){
            throw new IllegalArgumentException("List animal is null or empty!");
        }

        List<Animal> notFlyableAnimals = new ArrayList<>();
        for (Animal animal : animalList) {
            if (!animal.isFlyable()){
                notFlyableAnimals.add(animal);
            }
        }

        Animal winner = null;
        if (notFlyableAnimals.isEmpty()){
            throw new IllegalArgumentException("There is no eligible to racing!");
        } else if (notFlyableAnimals.size() == 1){
            winner = notFlyableAnimals.get(0);
        } else {
            for (Animal animal : notFlyableAnimals) {
                if (winner == null){
                    winner = animal;
                } else {
                    if (animal.getSpeed() > winner.getSpeed()){
                        winner = animal;
                    }
                }
            }
        }
        return winner;
    }
}
