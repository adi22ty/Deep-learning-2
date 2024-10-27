import java.util.List;

public class Day22 {
    static class Node{
        int data;
        Node next;
        private Node head;
        private Node tail;
        private int size;
        // TimeComplexity=O(1);

        public void addfirst(int item){
            Node nn=new Node();
            nn.data=item;
            if(size==0){
                head=nn;
                tail=nn;
                // size++;
            }else{
                nn.next=head;
                head=nn;
            }
            size++;
        }

        public void addlast(int item){
            if(size==0){
                addfirst(item);
            }
            else{
                Node nn=new Node();
                nn.data=item;
                tail.next=nn;
                tail=nn;
                size++;

            }
        }
        public Node getNode(int index){
            Node temp=head;
            for(int i=0;i<index;i++){
                temp=temp.next;
            }
            return temp;


        }
        public void addAtIndex(int item,int index){
            if(index==0) addfirst(item);
            else if(index==size-1) addlast(item);
            else{
                Node nn=new Node();
                nn.data=item;
                Node k_1th=getNode(index-1);
                k_1th.next=nn;
                size++;

            }
        }
        public int getfirst(){
            return head.data;

        }
        public int getlast(){
            return tail.data;

        }
        public int getIndex(int k){
            if(k<0||k>size)
            return -1;
            else if(k==0)
            return getfirst();
            else if(k==size-1)
            return getlast();
            else{
                return getNode(k).data;
            }

        }
        public int removefirst(){
            int rv=head.data;
            if(size==1){
                head=null;
                tail=null;
            }else{
                Node temp=head;
                head=head.next;
                temp.next=null;
            }
            size--;
            return rv;

        }
        public int removelast(){
            if(size==1){
                return removefirst();
            }
            else{
                int rv=tail.data;
                Node s1=getNode(size-2);
                s1.next=null;
                tail=s1;
                size--;
                return rv;
            }
        }
        public int removeindex(int k){
            if(k==0) return removefirst();
            else if(k==size-1)
            return removelast();
            else{
                Node K_1th= getNode(k-1);
            Node K_th= K_1th.next;
            K_1th.next= K_th.next;
            K_th.next= null;
            size--;
            return K_th.data;
            }
        }
 
        public void display(int nn){
            Node temp= head;
            while(temp!=null){
                System.out.print(temp.data+"--");
                temp=temp.next;
            }
            System.out.println("NULL");


        }
        public int size(){
            return size;
        }


    }
    public static void main(String[] args) {
        Node list = new Node();

        // Add elements at the beginning
        list.addfirst(10);
        list.addfirst(20);
        list.addfirst(30);

        // Display the current list
        System.out.print("List after adding first: ");
        list.display(0); // `0` passed just to match the method signature

        // Add elements at the end
        list.addlast(40);
        list.addlast(50);

        // Display the updated list
        System.out.print("List after adding last: ");
        list.display(0); // `0` passed just to match the method signature
    


 

    }

    
    
}
















          
        
    
