import java.util.*;
import java.util.HashMap;
public class Encrypting {
    public static void main(String... args) {

        String out = "";
        int[] notSoCrypticMessage = {1, 12, 1, 2, 11, 1, 7, 11, 1, 49, 1, 3, 11, 1, 50, 11};

        Map<Integer, String> hmap = new HashMap<Integer, String>();

        hmap.put(7, "run around and desert you");
        hmap.put(50, "tell a lie and hurt you");
        hmap.put(49, "make you cry,");
        hmap.put(2, "let you down");
        hmap.put(12, "give you up,");
        hmap.put(1, "Never gonna");
        hmap.put(11, "\n");
        hmap.put(3, "say goodbye");

        // Things are a little bit messed up
        // Your job is to decode the notSoCrypticMessage by using the hashmap as a look up table
        // Assemble the fragments into the out variable

        for (int code = 0;code < notSoCrypticMessage.length;code++){
            System.out.println(hmap.get(notSoCrypticMessage[code]));
            }
        }

    }
