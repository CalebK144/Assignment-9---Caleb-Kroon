/*
Remember that stacks/queues/linkedlists all work super similarly to arraylists, so i bet you $10 you could reference earlier HW if you get stuck....

1. Take the stack I created and find the maximum and minimum value
2. Find out how many elements were in the stack

3. Find the middle value of the linkedlist I created

4. Implement a real life example of any of the structures and do at least 3 operations to it
*/

import java.util.Stack;
import java.util.LinkedList;

public class Assignment9 {
    public static void main(String[] args) {
        System.out.println();
        
        Stack<Integer> stax = new Stack<>();
        
        stax.push(70);
        stax.push(34);
        stax.push(807);
        stax.push(61);
        stax.push(28);
        stax.push(563);
        stax.push(492);
        stax.push(386);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < stax.size(); i++) {
            int num = stax.get(i);
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Count: " + stax.size() + " elements");

        System.out.println("-----");

        LinkedList<Integer> linky = new LinkedList<>();

        linky.add(10);
        linky.add(20);
        linky.add(30);
        linky.add(40);
        linky.add(50);

        int middleVal = linky.size() / 2;
        System.out.println("Middle val: " + linky.get(middleVal));

        System.out.println("-----");

        //irl example - plane seating
        LinkedList<String> planeSeating = new LinkedList<>();
        planeSeating.add("1A");
        planeSeating.add("1B");
        planeSeating.add("1C");
        planeSeating.add("2A");
        planeSeating.add("2B");
        planeSeating.add("2C");

        System.out.println("Initial seating arrangement: " + planeSeating);
        System.out.println();
        System.out.println();

        //boarding boarding an extra passenger, adding them to a spare seat
        System.out.println("Boarding extra passenger: 3A");
        planeSeating.add("3A");
        System.out.println("Updated seating arrangement: " + planeSeating);
        System.out.println();

        //just finding who was the first to board
        System.out.println("First passenger that boarded: " + planeSeating.getFirst());
        System.out.println("Current seating arrangement: " + planeSeating);
        System.out.println();

        //spare passenger had a heart attack and has to leave the plane
        System.out.println("Passenger leaving the plane after heart attack: " + planeSeating.removeLast());
        System.out.println("Updated seating arrangement: " + planeSeating);
        System.out.println();
        System.out.println();

        System.out.println("Final seating arrangement: " + planeSeating);

        System.out.println();
        //sorry for all the prints lol just looks better in console
    }
}