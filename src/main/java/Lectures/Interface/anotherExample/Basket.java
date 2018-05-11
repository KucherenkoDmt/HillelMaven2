package Lectures.Interface.anotherExample;

import java.util.ArrayList;
import java.util.List;

public class Basket implements Sized{
    private List<String> fruitsList = new ArrayList<>();

    public void addFruit(String fruit) {
        fruitsList.add(fruit);
    }

    public int size() {
        return fruitsList.size();
    }

    public boolean isBasketEmpty() {
        return isEmpty();
    }
}
