import java.util.HashMap;

public class Greed {
    public static int greedy(int[] dice){
        HashMap<Integer, Integer> diceTable = new HashMap<>();
        for (int die : dice) {
            if (diceTable.containsKey(die)) {
                Integer value = diceTable.get(die) + 1;
                diceTable.put(die, value);
            } else {
                diceTable.put(die, 1);
            }
        }
        int sum = 0;
        for (Integer integer : diceTable.keySet()) {
            if (diceTable.get(integer) >= 3) {
                if (integer == 1) {
                    sum += 1000;
                } else {
                    sum += integer*100;
                }
                diceTable.put(integer, diceTable.get(integer) - 3);
            }
        }
        if (diceTable.containsKey(1) && diceTable.get(1) > 0) {
            sum += diceTable.get(1) * 100;
        }

        if (diceTable.containsKey(5) && diceTable.get(5) > 0) {
            sum += diceTable.get(5) * 50;
        }
        return sum;
    }
}
