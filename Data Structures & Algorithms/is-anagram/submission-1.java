class Solution {
    public boolean isAnagram(String s, String t) {
           if(s.length()!=t.length())
              return false;   
           int freq[]=new int[26];

           for(char ch:s.toCharArray())
               freq[ch-'a']++;

            for(int i=0;i<t.length();i++){
                if(freq[t.charAt(i)-'a']==0)
                    return false;
                    freq[t.charAt(i)-'a']--;


            } 

            return true;  
    }
}
