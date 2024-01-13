import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arr = new ArrayList<>();

        int a = Integer.parseInt(br.readLine());
        int x = 0;

        for (int i = 0; i < 10; i++) {
            arr.add(x);
            x++;
            if (x == a) {
                x = 0;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("N[" + i + "] = " + arr.get(i));
        }
    }
}
