//Time Complexity: O(N)
//Space Complexity: O(1)
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Boolean> map2 = new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(map1.containsKey(s.charAt(i)) ){
                if(map1.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            } else{
                if(map2.containsKey(t.charAt(i))){
                    return false;
                }else{
                    map1.put(s.charAt(i),t.charAt(i));
                    map2.put(t.charAt(i),true);
                }

            }
        }
        return true;
    }
}