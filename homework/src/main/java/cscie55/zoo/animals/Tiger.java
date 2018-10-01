package cscie55.zoo.animals;

import java.util.ArrayList;
import java.util.List;

public class Tiger {
    private String name;
    private int age;
    private List<String> favoriteFoods = new ArrayList<String>();

    public Tiger() {
    }
    /**
     *
     * @return name of the animal
     */
    public String getName() {
        return name;
    }

    /**
     * sets the animal name as the name provided
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return age of the animal
     */
    public int getAge() {
        return age;
    }

    /**
     * sets the animal age as the name provided
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     *
     * @return Favorote food of the animal
     */
    public List<String> getFavoriteFoods() {
        return favoriteFoods;
    }

    /**
     * sets the animal favoriteFoods as the name provided
     * @param favoriteFoods
     */
    public void setFavoriteFoods(List<String> favoriteFoods) {
        this.favoriteFoods = favoriteFoods;
    }

    /**
     * Ensures tiger is eating well
     */
    public void eat() {
        System.out.println("No veggies please");
    }

    /**
     * prints tiger talk
     */
    public void speak() {
        System.out.println("growl");
    }

    /**
     * tiger play
     */
    public void play() {
        System.out.println("tiger games");
    }
}
