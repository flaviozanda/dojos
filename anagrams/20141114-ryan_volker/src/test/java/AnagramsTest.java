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

    @Test
     public void shouldReturnSelfIfOneCharacter() {
         String startWord = "s";
         List<String> anagrams = new Anagrams().of(startWord);

         assertThat(anagrams).hasSize(1);
         assertThat(anagrams).contains(startWord);
     }

    @Test
    public void shouldReturnTwoAnagramsIfTwoCharacters() {
        String startWord = "st";
        String startWordReversed = "ts";
        List<String> anagrams = new Anagrams().of(startWord);

        assertThat(anagrams).hasSize(2);
        assertThat(anagrams).contains(startWord);
        assertThat(anagrams).contains(startWordReversed);
    }

    @Test
    public void shouldReturnSixAnagramsIf3Chars() {
        String startWord = "123";
        String[] expectedAnagrams = {"123", "132", "213", "231", "312", "321"};

        List<String> anagrams = new Anagrams().of(startWord);

        assertThat(anagrams).containsAll(Arrays.asList(expectedAnagrams));
        assertThat(anagrams).hasSize(expectedAnagrams.length);
    }

    @Test
    public void shouldWorkFor4Chars() {
        String[] expected = {"4123", "4132", "4213", "4231", "4312", "4321",
                "1423", "1432", "2413", "2431", "3412", "3421",
                "1243", "1342", "2143", "2341", "3142", "3241",
                "1234", "1324", "2134", "2314", "3124", "3214"};

        List<String> anagrams = new Anagrams().of("1234");

        assertThat(anagrams).containsAll(Arrays.asList(expected));
        assertThat(anagrams).hasSize(expected.length);
    }
}
