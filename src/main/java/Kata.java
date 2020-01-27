import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata {
    static String conferencePicker(String[] citiesVisited, String[] citiesOffered) {
        return Arrays.stream(citiesOffered).filter(city -> !Arrays.stream(citiesVisited).collect(Collectors.toList())
                .contains(city)).findFirst().orElse("No worthwhile conferences this year!");
    }
}
