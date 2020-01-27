import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Feelings {

    public static int countFeelings (String string, String[] array) {
        List<Character> input = new ArrayList<>();
        char[] letters = string.toCharArray();
        for (char c : letters) {
            input.add(c);
        }
        int count = 0;
        char[] word;
        for (String str : array) {
            word = str.toCharArray();
            List<Character> characters = new ArrayList<>();
            for (char z : word) {
                characters.add(z);
            }
            if (input.containsAll(characters)) {
                count++;
            }
        }
        return count;
    }
}


/*
* Test.describe("Basic tests",() => {
  Test.assertEquals(countFeelings('yliausoenvjw', ['anger', 'awe', 'joy', 'love', 'grief']), '3 feelings.');
  Test.assertEquals(countFeelings('angerw', ['anger', 'awe', 'joy', 'love', 'grief']), '2 feelings.');
  Test.assertEquals(countFeelings('griefgriefgrief', ['anger', 'awe', 'joy', 'love', 'grief']), '1 feeling.');
  Test.assertEquals(countFeelings('abcdkasdfvkadf', ['desire', 'joy', 'shame', 'longing', 'fear']), '0 feelings.');
});*/