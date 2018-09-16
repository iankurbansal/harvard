package cscie55.zoo.animals;

import java.util.ArrayList;
import java.util.List;

public class Deer {
    private String name;
    private int age;
    private List<String> favoriteFoods = new ArrayList<String>();

    public Deer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getFavoriteFoods() {
        return favoriteFoods;
    }

    public void setFavoriteFoods(List<String> favoriteFoods) {
        this.favoriteFoods = favoriteFoods;
    }
}
