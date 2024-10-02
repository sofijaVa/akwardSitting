import java.util.HashMap;
import java.util.Scanner;

public class awkwardparty {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] languages = new int[n];
        for (int i = 0; i < n; i++) {
            languages[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> lastSeen = new HashMap<>();

        int awkwardnessLevel = n;

        for (int i = 0; i < n; i++) {
            int lang = languages[i];

            if (lastSeen.containsKey(lang)) {
                int lastPosition = lastSeen.get(lang);
                int distance = i - lastPosition;

                awkwardnessLevel = Math.min(awkwardnessLevel, distance);
            }

            lastSeen.put(lang, i);
        }

        System.out.println(awkwardnessLevel);

        sc.close();


    }

}
