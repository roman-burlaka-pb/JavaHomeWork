package com.pb.burlaka.hw6;

public class Dog extends Animal {
    private String name;

    public Dog() {
    }

    public Dog(String food, String location) {
        super(food, location);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("Собака ест.");
    }

    public String makeNoise() {
        return "Гав-гав-гав!!!";
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        if (!super.equals(o)) return false;

        Dog dog = (Dog) o;

        return name != null ? name.equals(dog.name) : dog.name == null;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public String toString() {
        return "Dog{" +
                "food='" + getFood() + '\'' +
                ", location='" + getLocation() + '\'' +
                '}';
    }
}
