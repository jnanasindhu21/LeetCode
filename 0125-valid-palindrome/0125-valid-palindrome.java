class Solution {
    public boolean isPalindrome(String s) {
        //int n = 0;
        String a = "";
        String a1 = "";
        for(int i=0; i<s.length(); i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
                a = a + s.charAt(i);
        }
        
        for( int i = a.length()-1; i>=0; i--)
            a1 = a1 + a.charAt(i);
         return a.equalsIgnoreCase(a1);
        
    }
}