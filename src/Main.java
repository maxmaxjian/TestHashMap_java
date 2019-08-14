import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < 5; i++)
            map.put(i, i+10);

        for (Map.Entry<Integer,Integer> entry : map.entrySet())
            System.out.println(entry.getKey()+": "+entry.getValue());
    }
}
