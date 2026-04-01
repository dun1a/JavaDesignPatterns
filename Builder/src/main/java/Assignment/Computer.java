package Assignment;

import Example.Ingredient;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    // represents the final computer product
    // should include various components such as Processor, RAM, hard drive, Graphics card, Operating System

    private List<String> components; // list of components for the computer

    public Computer() {
        this.components = new ArrayList<>();
    }

    public void addComponent(String component) {
        components.add(component);
    }

    // converts the computer's components into a string representation for display
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Computer Components:\n");
        for (String component : components) {
            sb.append(component);
            sb.append("\n");
        }
        return sb.toString();
    }

}