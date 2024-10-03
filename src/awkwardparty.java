import java.util.HashMap;
import java.util.Scanner;

public class awkwardparty {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //read the number of guests
        int n = sc.nextInt();

        //create language array and
        // fill it with presented languages
        int[] languages = new int[n];
        for (int i = 0; i < n; i++) {
            languages[i] = sc.nextInt();
        }

        //initialize hashmap to store the
        // language and index where this language is last seen

        HashMap<Integer, Integer> lastSeen = new HashMap<>();

        //if nobody speaks the same language,
        // the awkwardness level is n
        int awkwardnessLevel = n;

        //iterate over guest list and check each guest's language
        for (int i = 0; i < n; i++) {
            int lang = languages[i];

            //if current language has been already seen
            if (lastSeen.containsKey(lang)) {
                //then we check last found position of current language
                int lastPosition = lastSeen.get(lang);
                //and calculate the new distance between same languages
                int distance = i - lastPosition;

                //get minimum between current awkwardness level and new distance
                awkwardnessLevel = Math.min(awkwardnessLevel, distance);
            }

            //insert new pair to hash table or update
            // existing pair with new distance
            lastSeen.put(lang, i);
        }

        //print the awkwardness level
        System.out.println(awkwardnessLevel);

        sc.close();


    }

}
