/**
 * Adam Omais, 107, Assignment 2
 */

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * SimpleList class implements methods to create and use a custom ArrayList
 */
public class SimpleList {
    private int[] list;
    private int count;

    /**
     * creates an array called list and a counter int
     */
    public SimpleList() {
        list = new int[10];
        count = 0;
    }

    /**
     * push a variable to the array and increment count
     * @param a  the integer to add to the beginning of the list
     */
    public void add(int a) {
        if (count == list.length) {
            double len = list.length * 1.5;
            int[] newlist = new int[(int)len];
            for (int i = 0; i < list.length; i++){
                newlist[i] = list[i];
            }
            list = newlist;
        }
        for (int i = list.length - 1; i > 0; i--) {
            list[i] = list[i - 1];
        }
        count++;
        list[0] = a;
    }

    /**
     * search for a variable in the list and remove it if found, decrement count
     * @param a  the int to search for and remove from the list.
     */
    public void remove(int a) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == a) {
                for (int j = i; j < list.length - 1; j++) {
                    list[j] = list[j + 1];
                }
                count--;
            }
        }
        double len = list.length * 0.75;
        if (count < (int)len){
            int[] newlist = new int[(int)len];
            for (int i = 0; i < (int)len; i++){
                newlist[i] = list[i];
            }
            list = newlist;
        }
    }

    /**
     * return the value of count
     * @return  return the int count
     */
    public int count() { return count; }

    /**
     * search a variable in the list and return its index
     * @param a  the int to search for.
     * @return  return the inndex of the searched variable
     */
    public int search(int a) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == a) {
                return i;
            }
        }
        return -1;
    }

    /**
     * return the list as a string delimited by spaces
     * @return  return a concatenated string of the array
     */
    public String toString(){
        String result = Arrays.stream(list)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));
        return result;
    }

    /**
     * adds an element to the end of the array
     * @param a  the int to add to the end of the list.
     */
    public void append(int a) {
        if (count == list.length) {
            double len = list.length * 1.5;
            int[] newlist = new int[(int) len];
            for (int i = 0; i < list.length; i++) {
                newlist[i] = list[i];
            }
            list = newlist;
        }
        list[count] = a;
        count++;
    }

    /**
     * returns the first element of the array
     * @return  return the first value in the list
     */
    public int first(){
        return list[0];
    }

    /**
     * returns the size of the array
     * @return  return the size of the array
     */
    public int size(){
        return list.length;
    }
}
