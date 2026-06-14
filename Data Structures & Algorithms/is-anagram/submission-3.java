class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()) return false;
        int[] count = new int[26];
        int size1= s.length();
        for(int i = 0;i< size1 ;i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }

        for(int i : count){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
