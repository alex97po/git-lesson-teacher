import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

public class AmazonTest {

    @Before
    public void createInputArray () {
        Greed greed = new Greed();
    }

    @Test
    public void result_OneDayTest() {
        assertEquals("Score for [5,1,3,4,1] must be 250:", 250, Greed.greedy(new int[]{5,1,3,4,1}));
        assertEquals("Score for [1,1,1,3,1] must be 1100:", 1100, Greed.greedy(new int[]{1,1,1,3,1}));
        assertEquals("Score for [2,4,4,5,4] must be 450:", 450, Greed.greedy(new int[]{2,4,4,5,4}));
    }

    @Test //test 0
    public void test1() {
        assertEquals("Score must be 0:",0, Greed.greedy(new int[]{2,2,3,4,6}));
    }

    @Test //test 1*1
    public void test2(){
        assertEquals("Score must be 100:",100, Greed.greedy(new int[]{1,2,3,4,6}));
    }
    @Test //test 5*1
    public void test3(){
        assertEquals("Score must be 50:",50, Greed.greedy(new int[]{5,2,3,4,6}));
    }
    @Test //test 2
    public void test4(){
        assertEquals("Score must be 250:", 250, Greed.greedy(new int[]{5,1,3,4,1}));
    }
    @Test //test 1*>3
    public void test5(){
        assertEquals("Score must be 1100:", 1100, Greed.greedy(new int[]{1,1,1,3,1}));
    }
    @Test //test 4 and 5
    public void test6(){
        assertEquals("Score must be 450:", 450, Greed.greedy(new int[]{2,4,4,5,4}));
    }
    @Test //test 1*>3 and 5
    public void test7(){
        assertEquals("Score must be 1150:", 1150, Greed.greedy(new int[]{1,1,1,5,1}));
    }
    @Test //test 0
    public void test8(){
        assertEquals("Score must be 0:", 0, Greed.greedy(new int[]{2,3,4,6,2}));
    }
    @Test //test 3 and 5
    public void test9(){
        assertEquals("Score must be 350:", 350, Greed.greedy(new int[]{3,4,5,3,3}));
    }
    @Test //test 2 and 5
    public void test0(){
        assertEquals("Score must be 250:", 250, Greed.greedy(new int[]{1,5,1,2,4}));
    }
    @Test //test 6 and 1
    public void test10(){
        assertEquals("Score must be 700:", 700, Greed.greedy(new int[]{6,6,6,6,1}));
    }

    private static final Random rnd = new Random();

    @Test
    public void testRandomWithTriples() {

        for(int i=0; i<50; ++i) {

            int triple = rnd.nextInt(6) + 1;
            int single1 = rnd.nextInt(6) + 1;
            int single2 = rnd.nextInt(6) + 1;

            List<Integer> candidates = Arrays.asList(triple, triple, triple, single1, single2);
            Collections.shuffle(candidates);
            int[] dice = candidates.stream().mapToInt(Integer::valueOf).toArray();

            int expected = triple == 1 ? 1000 : triple * 100;
            expected += single1 == 1 ? 100 : (single1 == 5 ? 50 : 0);
            expected += single2 == 1 ? 100 : (single2 == 5 ? 50 : 0);
            assertEquals(expected, Greed.greedy(dice));
        }
    }

    @Test
    public void testRandomNoTriples() {

        List<Integer> candidates = Arrays.asList(1, 1, 2, 2, 3, 3 , 4, 4, 5, 5, 6 ,6);

        for(int i=0; i<50; ++i) {
            Collections.shuffle(candidates);
            int[] dice = candidates.subList(0,  5).stream().mapToInt(Integer::valueOf).toArray();
            int expected = 0;

            for(int die : dice) {
                expected += die == 1 ? 100 : (die == 5 ? 50 : 0);
            }
            assertEquals(expected, Greed.greedy(dice));
        }
    }

}