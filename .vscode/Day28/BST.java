package Day28;

public class BST {
    private Node root;
    public BST(int [] arr){
        root=CreateTree(arr,0,arr.length-1);
    }
    private Node CreateTree(int []arr,int low,int high){
        if(low>high) return null;
        int mid=(low+high)/2;
        Node nn=new Node();
        nn.val=arr[mid];
        nn.left=CreateTree(arr,low,mid-1);
        nn.right=CreateTree(arr, mid+1, high);
        return nn;
    }

    
}
