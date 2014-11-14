import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

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
public class AnagramsTest {

    private static String INPUT = "biro";
    private static String[] TWO_LETTERS_OUTPUT = {"ab", "ba"};

    @Test
    public void testOneCharStringHasTheSameAnagram() throws Exception {
        List<String> anagrams = new ArrayList<String>();
        anagrams.add("B");
        assertThat(Anagrams.anagramsFor("B")).isEqualTo(anagrams);
    }

    @Test
    public void testInputIsNotEmpty() throws Exception {
        assertThat(Anagrams.anagramsFor("")).isEmpty();
    }

    @Test
    public void testTwoLettersString() {
        assertThat(Anagrams.anagramsFor("ab")).isEqualTo(Arrays.asList(TWO_LETTERS_OUTPUT));
    }

}
