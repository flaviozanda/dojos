import java.util.ArrayList;
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
    public List<String> of(String startText) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add(startText);
        if (startText.length() > 1) {
            arrayList.add(lastToFirst(startText));
        }
        return arrayList;
    }

    private String lastToFirst(String startText) {
        return startText.substring(1) + startText.charAt(0);
    }
}
