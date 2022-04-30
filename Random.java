package Other;

import java.util.ArrayList;

/**
 * A file that makes it easier to use random
 * 
 * @author Elijah
 * @version 1.1
 */

public class Random {
    /**
     * Randomly chooses an integer between the start and end points
     * 
     * @param start the starting point
     * @param stop  the ending point
     * @return a random integer between start and stop
     */
    public static int randint(int start, int stop) {
        int num = (int) (Math.random() * (stop - start)) + start;
        return num;
    }

    public static int randint(int start, int stop, int step) {
        stop = (int) (stop / step);
        start = (int) (start / step);
        int num = ((int) (Math.random() * (stop - start)) + start) * step;
        return num;
    }

    /**
     * Randomly chooses a number (with a decimal) between the start and end points.
     * Also rounds the number up to 2 decimal places
     * 
     * @param start the starting point
     * @param stop  the ending point
     * @return a random number (with a decimal) between start and stop
     */
    public static double randint(double start, double stop) {
        double num = (Math.random() * (stop - start)) + start;
        num = (int) (num * 100);
        num = (double) (num / 100);
        return num;
    }

    /**
     * Randomly chooses a number (with a decimal) between the start and end points
     * 
     * @param start the starting point
     * @param stop  the ending point
     * @param place the amount of places to round up by
     * @return a random number (with a decimal) between start and stop
     */
    public static double randint(double start, double stop, int place) {
        int pos = (int) (Math.pow(10, place));
        double num = (Math.random() * (stop - start)) + start;
        num = (int) (num * pos);
        num = (double) (num / pos);
        return num;
    }

    /**
     * Randomly chooses any string object from the list
     * 
     * @param stuff the list of string objects
     * @return a randomly chosen item
     */
    public static String choice(String[] stuff) {
        int num = randint(0, stuff.length - 1);
        return stuff[num];
    }

    /**
     * Randomly shuffles the list of string objects
     * 
     * @param stuff the list of string objects
     * @return the shuffled list
     */
    public static String[] shuffle(String[] stuff) {
        ArrayList<String> newStuff = new ArrayList<String>();
        for (int i = 0; i < stuff.length; i++) {
            int num = randint(0, stuff.length);
            while (newStuff.toString().indexOf(stuff[num]) != -1)
                num = randint(0, stuff.length);
            newStuff.add(stuff[num]);
        }

        String newList[] = new String[newStuff.size()];
        for (int i = 0; i < newStuff.size(); i++) {
            newList[i] = newStuff.get(i);
        }

        return newList;
    }

    /**
     * Randomly shuffles the integer list
     * 
     * @param stuff the list of integers
     * @return the shuffled list
     */
    public static int[] shuffle(int[] stuff) {
        int[] newList = new int[stuff.length];
        for (int i = 0; i < stuff.length; i++) {
            int num = randint(0, stuff.length);
            while (newList.toString().indexOf("" + stuff[num]) != -1)
                num = randint(0, stuff.length);
            newList[num] = stuff[num];
        }
        return newList;
    }

    public static ArrayList<String> shuffle(ArrayList<String> stuff) {
        ArrayList<String> newStuff = new ArrayList<String>();
        for (int i = 0; i < stuff.size(); i++) {
            int num = randint(0, stuff.size());
            while (newStuff.toString().indexOf(stuff.get(num)) != -1)
                num = randint(0, stuff.size());
            newStuff.add(stuff.get(num));
        }

        return newStuff;
    }

    /**
     * Rolls a dice (default is a single 6-sided dice)
     * 
     * @return the roll of the dice
     */
    public static int roll() {
        int num = randint(1, 6);
        return num;
    }

    /**
     * Rolls a dice by the amount sent
     * 
     * @param sides the amount of sides on the dice
     * @return the roll of the dice
     */
    public static int roll(int sides) {
        int num = randint(1, sides);
        return num;
    }

    /**
     * Rolls a number of dice with sides equal to the amount sent
     * 
     * @param sides the amount of sides on the dice
     * @param dice  the amount of dice to roll
     * @return the roll of the dice
     */
    public static int roll(int sides, int dice) {
        int total = 0;
        for (int i = 0; i < dice; i++) {
            int num = randint(1, sides);
            total += num;
        }

        return total;
    }
}
