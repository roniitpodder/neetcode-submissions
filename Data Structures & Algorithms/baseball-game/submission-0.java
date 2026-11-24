class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<operations.length;i++){
            String s=operations[i];
            if(s.equals("+")){
                int x=stack.pop();
                int y=stack.pop();
                int sum=x+y;
                stack.push(y);
                stack.push(x);
                stack.push(sum);
            }
            else if(s.equals("D")){
                int x=stack.pop();
                stack.push(x);
                stack.push(x*2);
            }
            else if(s.equals("C")){
                stack.pop();
            }
            else{
                stack.push((Integer.parseInt(s)));
            }
        }
        int sum=0;
        for(int i:stack){
            sum+=i;
        }
        return sum;
    }
}