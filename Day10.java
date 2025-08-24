import java.util.*;
class anagrams {
    public static List<List<String>> groupanagram(String[] strs){
        Map< String, List<String>> map = new HashMap<>();
        for(String word: strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }
    public static void main (String[] args){
        String[] strs = {"eat", "ate", "tea", "tan", "nat"};
        System.out.println(groupanagram(strs));
    }
}
