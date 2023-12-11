import java.util.*;
import java.util.stream.Collectors;

public class LeetCode49 {

    public List<List<String>> groupAnagrams(String[] strs) {


        Map<String, List<String>> map = Arrays.stream(strs)
                .collect(Collectors.groupingBy(x -> {
                    char[] chars = x.toCharArray();
                    Arrays.sort(chars);
                    return new String(chars);
                }));

        return new ArrayList<>(map.values());

    }
}
