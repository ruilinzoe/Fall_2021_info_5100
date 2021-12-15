package Final;

import java.util.*;

public class Anagram {
        public static List<List<String>> groupAnagrams(String[] strs) {
            if (strs.length == 0) return new ArrayList();
            List<List<String>> result = new ArrayList<>();
            HashMap<String, List<String>> map = new HashMap<>();
            for(String str: strs){
                char[] chArr = str.toCharArray();
                Arrays.sort(chArr);
                String key = new String(chArr);
                if(map.containsKey(key)){
                    map.get(key).add(str);
                } else {
                    List<String> strList = new ArrayList<>();
                    strList.add(str);
                    map.put(key, strList);
                }
            }

            result.addAll(map.values());
            return result;
        }

        public static void main(String[] args) {
            String[] strs = {"eat", "tea", "pie", "ate", "eip"};
            List<List<String>> result  = groupAnagrams(strs);
            result.forEach(t -> System.out.println(t + " "));
        }
}
