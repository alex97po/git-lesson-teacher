import java.util.Arrays;

public class Dinglemouse {
    public static boolean allAlone(char[][] house) {
        char [] target = new char[]{'#', 'o', '#'};
        int index = 0;
        int oIndex = 0;
        for (int y = 0; y < house.length; y++) {
            for (int i = 0; i < house[y].length; i++) {
                if (house[y][i] == target[index]) {
                    if (index == 1) {
                       oIndex = i;
                        index++;
                    } else if (index == 2) {
                        for (int z = 0; z < y; z++) {
                            if (house[z][oIndex] == '#') {
                                for (int k = y+1; k < house.length; k++) {
                                    if (house[k][oIndex] == '#') {
                                        return false;
                                    }
                                }
                            }
                        }
                    } else {
                        index++;
                    }
                }
            }
            index = 0;
        }
        return true;
    }
}
