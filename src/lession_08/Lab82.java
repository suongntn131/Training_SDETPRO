package lession_08;

import java.util.ArrayList;
import java.util.List;

public class Lab82 {
    /**
     * Racing animal simple version*
     * Horse: Max 75 km/h
     * Tiger: Max 100 Km/h
     * Dog: Max 60 KM/h*
     * Create an Animal class with a method speed() which return a random speeds
     * Create 3 objects for those 3 animal type
     * Run and see which animal is winner for racing
     * Bonus: Default name with Class variable
     * Format: Winner is <Animal name>, with speed: <speed>
     * Hints:* * Class name can get from: object.getClass().getSimpleName();
     * int randomSpeed = new SecureRandom().nextInt(50);
     */

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        List<Animal> animalList = new ArrayList();
        animalList.add(dog);
        animalList.add(horse);
        animalList.add(tiger);

        getWinner(animalList);

    }

    public static void getWinner(List<Animal> animalList){
        int indexWinner = 0;
        for (int i = 1; i < animalList.size(); i++) {
            if (animalList.get(i).getSpeed() > animalList.get(indexWinner).getSpeed()){
                indexWinner = i;
            }
        }
        System.out.println("Winner is " + animalList.get(indexWinner).getClass().getSimpleName() + " with speed: " + animalList.get(indexWinner).getSpeed());
    }
}
