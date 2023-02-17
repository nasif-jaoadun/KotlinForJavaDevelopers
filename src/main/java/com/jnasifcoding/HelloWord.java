package main.java.com.jnasifcoding;

import com.jnasifcoding.practise.MaxKt;
import com.jnasifcoding.practise.Person;

public class HelloWord {
    public static void main(String[] args){
        System.out.println("Hello, Java");

        Person Abhik = new Person("Ishmam","Abhik");
        System.out.println("The new employee name is "+ Abhik.getFirstName());

        Abhik.setFirstName("Mahdy");
        System.out.println("The name is now "+Abhik.getFirstName());

        Integer maxInt = MaxKt.max(2001,2010);
        System.out.println("The max value is: " + maxInt);
    }
}
