public class Delivery {
    int path (int[][] table) {
        int path = 0;
        boolean nineFound = false;
        for (int i = 1; i < table[0].length; i++) {
            if (table[0][i] == 0) {
                break;
            } else if (table[0][i] == 9) {
                nineFound = true;
                break;
            } else {
                path++;
            }
        }
        return 0;
    }

}
