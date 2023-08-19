class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            //String x=;
            if(t.contains(String.valueOf(s.charAt(i))))
            {
                int z= t.indexOf(String.valueOf(s.charAt(i)));
               t= t.substring(0, z) + t.substring(z+1);
            }else{
                return false;
            }
        }


        return true;
    }
}