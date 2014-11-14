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

        char firstChar = startText.charAt(0);
        String remaining = startText.substring(1);

        for(int i = 0; i < 3; i++){
           StringBuilder stringBuilder = new StringBuilder();
           stringBuilder.append(remaining.substring(0, i));
           stringBuilder.append(firstChar);
           stringBuilder.append(remaining.substring(i));
        }
        // bye volker :-)
        return arrayList;
    }

    private String lastToFirst(String startText) {
        return startText.substring(1) + startText.charAt(0);
    }
}

