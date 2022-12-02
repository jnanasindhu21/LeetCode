class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        
        for(int i=0,l=s.length()-1; i<l; i++, l--)
        {
            if(Character.compare(s.charAt(i),(s.charAt(l)) ) != 0 )
                return false;
        }
        return true;
            
    }
}