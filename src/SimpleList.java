import java.util.Arrays;
import java.util.stream.Collectors;

public class SimpleList {
    private int[] list;
    private int count;

    //creates an array called list and a counter int
    public SimpleList() {
        list = new int[10];
        count = 0;
    }

    //push a variable to the array and increment count
    public void add(int a) {
        for (int i = list.length-1; i>0; i--) {
            list[i] = list[i-1];
        }
        count++;
        list[0] = a;
    }

    //search for a variable in the list and remove it if found, decrement count
    public void remove(int a) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == a) {
                for (int j = i; j < list.length - 1; j++) {
                    list[j] = list[j + 1];
                }
                count--;
                return;
            }
        }
    }

    //return the value of count
    public int count() {
        return count;
    }

    //search a variable in the list and return its index
    public int search(int a) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == a) {
                return i;
            }
        }
        return -1;
    }

    //return the list as a string delimited by spaces
    public String toString(){
        String result = Arrays.stream(list)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));
        return result;
    }
}
