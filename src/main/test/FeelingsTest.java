import org.junit.Test;

import static org.junit.Assert.*;

public class FeelingsTest {

    @Test
    public void countFeelings() {
        assertEquals(3, Feelings.countFeelings("yliausoenvjw", new String[]{"anger", "awe", "joy", "love", "grief"}));
        assertEquals(2, Feelings.countFeelings("angerw", new String[]{"anger", "awe", "joy", "love", "grief"}));
        assertEquals(1, Feelings.countFeelings("griefgriefgrief", new String[]{"anger", "awe", "joy", "love", "grief"}));
        assertEquals(0, Feelings.countFeelings("abcdkasdfvkadf", new String[] {"desire", "joy", "shame", "longing", "fear"}));
    }
}