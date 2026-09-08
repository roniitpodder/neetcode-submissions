class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str=strs[0];
        for(int i=0;i<strs.length;i++){
            while(!strs[i].startsWith(str)){
                str=str.substring(0,str.length()-1);
            }
        }
        return str;
    }
}