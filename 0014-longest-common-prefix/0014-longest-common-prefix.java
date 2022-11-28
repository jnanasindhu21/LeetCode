class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String s = "";
        if( strs.length == 0 || strs[0].length() == 0) 
            return s;
        char m = strs[0].charAt(0);
       if( strs[0].length() == 1 &&  strs.length == 1)
           return Character.toString(m);
        Arrays.sort(strs);
        char a[] = strs[0].toCharArray();
        char b[] = strs[strs.length-1].toCharArray();
        
        for(int i=0; i<strs[0].length(); i++)
        {
            if(a[i] != b[i])
                break;
            s = s + Character.toString(a[i]);
        }
       // for(int i=0; i<c.length; i++)
         //   System.out.println(c[i]);
        //String s1 = new String(c);
        return s.toString();
    }
}