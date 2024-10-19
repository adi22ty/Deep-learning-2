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
        public void display(int nn){
            Node temp= head;
            while(temp!=null){
                System.out.print(temp.data+"--");
                temp=temp.next;
            }
            System.out.println("NULL");


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
















          
        
    
