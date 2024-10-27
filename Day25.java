import java.util.Stack;

public class Day25 {
    public static void insertatfirst(Stack<Integer> stk,int item){
        // if(stk.empty()){
        //     stk.push(item);
        //     return;
        // }
        // int n=stk.pop();
        //     insertatfirst(stk, item);
        //     stk.add(n);
        //     System.out.println(stk);
        
        public static void NGE(int[] arr){
            Stack<Integer> stk=new Stack<>();
            int[] ans=new int[arr.length];
            for(int i=0;i<arr.length;i++){
                while(!stack.empty()&&arr[i]>arr[stk.peek()])
                ans[stk.pop()]=arr[i];
                stk.push(i);
            }
            while(!stk.empty())
            ans[stk.pop()]=-1;
            display(ans);


    }
}

    public static void main(String[] args) {
         Stack<Integer> stk1=new Stack<>();
         Stack<Integer> stk2=new Stack<>();
         stk1.push(10);
         stk1.push(20);
         stk1.push(30);
         stk1.push(40);
         while(!stk1.empty()){
            stk2.push(stk1.peek());
            stk1.pop();

         }
         stk1.push(5);
         while(!stk2.empty()){
            stk1.push(stk2.peek());
            stk2.pop();
         }
        //  System.out.println(stk1);
        // insertatfirst(stk1, 0);




        
    }

    
}
