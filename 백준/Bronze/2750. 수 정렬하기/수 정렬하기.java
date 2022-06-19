import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int arr[] = new int[a];
        for (int i = 0; i < a; i++) {
            int b = Integer.parseInt(br.readLine());
            arr[i] = b;
        }
        Arrays.sort(arr);

        for (int val : arr) {
            System.out.println(val);
        }
    }
}