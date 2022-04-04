package lession_09;

import java.security.SecureRandom;

public class Animal {
    private int speed;
    private boolean flyable;
    private String name;

    protected Animal(Builder builder){
        name = builder.name;
        speed = builder.speed;
        flyable = builder.flyable;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isFlyable() {
        return flyable;
    }

    public static class Builder {
        private String name;
        private int speed;
        private boolean flyable;

        public Builder withName(String name){
            this.name = name;
            return this;
        }

        public Builder withMaxSpeed(int maxSpeed){
            speed = new SecureRandom().nextInt(maxSpeed);
            return this;
        }

        public Builder withWings(boolean withWing){
            flyable = withWing;
            return this;
        }

        public Animal build(){
            return  new Animal(this);
        }
    }
}
