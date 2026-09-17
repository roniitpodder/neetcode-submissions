class Solution {
    public boolean validPalindrome(String s) {
        int f=0,e=s.length()-1;
        while(f<e){
            if(s.charAt(f)!=s.charAt(e)){
                return checkPal(s,f+1,e) || checkPal(s,f,e-1);
            }
            f++;
            e--;
        }
        return true;
    }
    private boolean checkPal(String s,int f,int e){
        while(f<e){
            if (s.charAt(f)!=s.charAt(e)){
                return false;
            }
            f++;
            e--;
        }
        return true;
    }
}