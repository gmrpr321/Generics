import java.util.ArrayList;
import java.util.Collections;

class GenSearchArray {
    ArrayList<Integer> array;

    GenSearchArray() {
        array = new ArrayList<Integer>();
    }

    public void add(Integer data) {
        array.add(data);
    }

    public void display() {
        for (Integer element : array) {
            System.out.println(element);
        }
    }

    public void countodd() {
        int count = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 != 0) {
                count += 1;
            }
        }
        System.out.println("Number of odd numbers in list : " + count);
    }

    public void swap(int inda, int indb) {
        Collections.swap(array, inda, indb);
        System.out.println(array.get(indb) + " and " + array.get(inda) + " are swapped");
    }

    public void maxInRange(int start, int end) {
        if (start < 0 || end > array.size() - 1 || start > end)
            return;
        Integer max = array.get(start);
        for (int i = start + 1; i <= end; i++) {
            if (array.get(i) > max) {
                max = array.get(i);
            }
        }
        System.out.println("Maximum number in range " + start + " - " + end + " : " + max);
    }
}

public class GenericArray {
    public static void main(String args[]) {
        GenSearchArray array = new GenSearchArray();
        array.add(2);
        array.add(4);
        array.add(6);
        array.add(8);
        array.add(10);
        array.add(3);
        array.add(9);
        array.countodd();
        array.swap(2, 4);
        array.maxInRange(0, 2);
    }
}
