import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        System.out.println("Массив до реверса :" + arrayList);
        Collections.reverse(arrayList);
        System.out.print("Массив после реверса :" + arrayList);
    }
}