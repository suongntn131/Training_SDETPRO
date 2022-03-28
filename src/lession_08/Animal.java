package lession_08;

import java.security.SecureRandom;

public class Animal {
    private String name;
    private int speed;
    private int maxSpeed;

    public Animal(int maxSpeed) {
        this.speed = new SecureRandom().nextInt(maxSpeed);
    }

    public int getSpeed() {
        return speed;
    }
}
