import java.util.ArrayList;

class Genlist<T> {
    ArrayList<T> list;

    Genlist() {
        list = new ArrayList<T>();
    }

    public void addData(T data) {
        list.add(data);
    }

    public String toString() {
        String str = "Data in list :\n";
        for (int i = 0; i < list.size(); i++) {
            str += " " + list.get(i) + " ";
        }
        return str;
    }

    public void search(T element) {
        int i;
        for (i = 0; i < list.size(); i++) {
            if (list.get(i) == element) {
                System.out.println("Element found at : " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }
}

public class ArrayOperations {
    public static void main(String args[]) {
        Genlist<Integer> list = new Genlist<Integer>();
        list.addData(1);
        list.addData(2);
        list.addData(3);
        list.addData(4);
        list.addData(5);
        System.out.println(list);
        list.search(Integer.valueOf(3));
    }
}