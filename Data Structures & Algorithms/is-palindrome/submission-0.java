class Solution {
    public boolean isPalindrome(String s) {
        int f=0,e=s.length()-1;
        while(f<=e){
            if(!Character.isLetterOrDigit(s.charAt(f))){
                f++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(e))){
                e--;
                continue;
            }
            if(Character.toUpperCase(s.charAt(f))==Character.toUpperCase(s.charAt(e))){
                f++;
                e--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
