import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Write a program to generate all potential
 * anagrams of an input string.
 * <p/>
 * For example, the potential anagrams of "biro" are
 * <p/>
 * biro bior brio broi boir bori
 * ibro ibor irbo irob iobr iorb
 * rbio rboi ribo riob roib robi
 * obir obri oibr oirb orbi orib
 */
public class Anagrams {

    public static List<String> anagramsFor(String b) {
        if ("".equals(b)) {
            return Collections.emptyList();
        }

        List<String> anagrams = new ArrayList<String>();

        anagrams.add(b);
        if (b.length() > 1) {
            anagrams.add(inverse(b));
        }
        return anagrams;
    }

    private static String inverse(String b) {
        String inverse = "";
        for (int i = b.length() - 1; i >= 0; i--) {
            inverse += b.charAt(i);
        }
        return inverse;

    }
}
