package Day26;

public class implementation {
    public static void main(String[] args) {
        Queues q= new Queues();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);

        q.enQueue(4);
        while(!q.isEmpty()){
        System.out.println(q.deQueue()+" ");
        }

    }
    
}
