class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();     
        for(int current:asteroids){
            boolean flag=true; //if flag is true then push element in stack
            
            while(!stack.empty() && (stack.peek()>0 && current<0)){
                // If the top asteroid in the stack is smaller, then it will explode.
                // Hence pop it from the stack, also continue with the next asteroid in the stack.
                if(Math.abs(stack.peek()) < Math.abs(current)){
                    stack.pop();
                    continue;
                }// If both asteroids have the same size, then both asteroids will explode.
                // Pop the asteroid from the stack; also, we won't push the current asteroid to the stack.
                else if(Math.abs(stack.peek()) == Math.abs(current)){
                    stack.pop();                    
                }             
                flag=false;
                break;
            }
            
            if(flag)
                stack.push(current);
        }
        
        int[] result = new int[stack.size()];
        for(int i=result.length-1;i>=0;i--){
            result[i]=stack.pop();
        }
        
        return result;
    }
}