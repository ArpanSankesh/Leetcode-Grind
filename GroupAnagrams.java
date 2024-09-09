import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(str);
        }
        
        return new ArrayList<>(map.values());
    }
    
    public static void main(String[] args) {
        GroupAnagrams ga = new GroupAnagrams();
        String[] strs1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(ga.groupAnagrams(strs1)); // Output: [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]

        String[] strs2 = {""};
        System.out.println(ga.groupAnagrams(strs2)); // Output: [[""]]

        String[] strs3 = {"a"};
        System.out.println(ga.groupAnagrams(strs3)); // Output: [["a"]]
    }
}
