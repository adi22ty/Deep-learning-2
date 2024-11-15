package Day29;

import java.util.ArrayList;

public class heap {
    private ArrayList<Integer> ll=new ArrayList<>();
    public heap(){};
    public heap(int[]arr){
        for(int i:arr)
        Add(i);
    }
    public void Add(int i){
        ll.add(i);
        upHeapify(ll.size()-1);
    }
    private void upHeapify(int ci){
        int pi=(ci-1)/2;
        if(ll.get(pi)>ll.get(ci)){
            swap(pi,ci);
            upHeapify(pi);
        }
    }
    private void swap(int pi,int ci){
        int val1=ll.get(pi);
        int val2=ll.get(ci);
        ll.set(pi,val2);
        ll.set(ci,val1);

    }
    public void display(){
        System.out.println(ll);
    }
    public int size(){
        return ll.size();
    }
    public int remove(){
        swap(0,ll.size()-1);
        int rv=ll.remove(ll.size()-1);
        downHeapify(0);
        return rv;
    }
    public void downHeapify(int pi){
        int lci=2*pi+1;
        int rci=2*pi+2;
        int mini =pi;
        if(lci<ll.size() && ll.get(lci)<ll.get(mini));
            mini=lci;
            if(rci<ll.size() && ll.get(rci)<ll.get(mini));
            mini=rci;
            if(mini!=pi){
                swap(mini,pi);
                downHeapify(mini);

            }
    }
}
