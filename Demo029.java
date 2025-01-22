
import java.util.ArrayList;
class ArrayListNames{
    void addFriendNames(){
        System.out.println("names of my friends: ");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("shiva");
        arrayList.add("vivek");
        arrayList.add("arun");
        String[] array = arrayList.toArray(new String[0]);
        for (String i : array) {
            System.out.println(i);
        }
    }
}
public class Demo029 {
    public static void main(String[] args) {
        ArrayListNames obj = new  ArrayListNames();
        obj.addFriendNames();

    }
}