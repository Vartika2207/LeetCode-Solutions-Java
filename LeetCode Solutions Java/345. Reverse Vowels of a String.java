class Solution {
    boolean isVowel(char a){
        if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u')
            return true;
        else if(a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U')
            return true;
        return false;
    }
    
    
    public String reverseVowels(String str) {
        char[] s = str.toCharArray();
        
        int i = 0, j = s.length - 1;
        while(i < j){
            
            if(isVowel(s[j]) == true && isVowel(s[i]) == true){
                char temp = s[i];
                s[i] = s[j];
                s[j] = temp;
                i++; j--;
            }
            else if(isVowel(s[i]))
                j--;
            else
                i++;
            
        }
        return String.valueOf(s);
    }
}
