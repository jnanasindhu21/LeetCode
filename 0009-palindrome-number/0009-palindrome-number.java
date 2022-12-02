class Solution {
    public boolean isPalindrome(int x) {

        
        
        //         String s = String.valueOf(x);
        
//         for(int i=0,l=s.length()-1; i<l; i++, l--)
//         {
//             if(Character.compare(s.charAt(i),(s.charAt(l)) ) != 0 )
//                 return false;
//         }
//         return true;
        
        
        // int rev =0;int num = x;
        // while(x != 0)
        // {
        //     rev = rev*10 + (x%10);
        //     x = x/10;
        // }
        // if(num == rev)
        //     return true;
        // else
        //     return false;
        
        int num = 0,temp = x;
      while(x>0){
              num = num*10 + x%10;
              x = x/10;
            }
      if(temp == num){
        return true;
      }
      return false;
            
    }
}