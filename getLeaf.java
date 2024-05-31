/*Weiyi Zeng
 * 251263642
 * Assignment 4
 * Due Nov.20th
 */
public class getLeaf<BinarySearchTree> {
	// A helper class to get Leaves, finding successor and predecessor
	private Pel successor;
    private Pel predecessor;
    public getLeaf(BinarySearchTree successor, BinarySearchTree predecessor) {
    	successor = null;
        predecessor = null;
	}
    public getLeaf() {
    	//setter
    	successor = null;
        predecessor = null;
	}

        
public BNode remove(BNode r, Location key) throws InexistentKeyException, EmptyTreeException {
	
	// remove Rec object
    	int loca = key.compareTo(r.getData().getLocation());
    	boolean R = r.rightChild().isLeaf(); 
    	boolean L = r.leftChild().isLeaf();    	
    	if(loca==1){
            r.setRightChild(remove(r.rightChild(),key));
        }
        else if(loca==-1){
            r.setLeftChild(remove(r.leftChild(),key));  
        }
        else if (loca!=1 || loca != -1)
        	
        {
        	boolean Leaf = r.isLeaf();
            while(Leaf== true) 
            {throw new EmptyTreeException("Empty"
            		+ "");}
            Pel lar = r.getData();
            largest(r);
            lar = largest(r);
            if(L == true) {
            if ( R == true) {
             return new BNode();
            }}
            else if(R==false) {
                   if(L==false ) {
               {
                    Pel pre = this.largest(r.leftChild());
                    r.setContent(pre);
                    r.setLeftChild(remove(r.leftChild(),pre.getLocation()));
                }
              
                };
            }
        }
        return r;
    }
        

public BNode insert(BNode r, Pel data){
    	/* inserting a rec object
    	 * 
    	 */
            if(r.isLeaf() != true) { 
               System.out.print("");
            }
            else {	
            	return new BNode(data,new BNode(),new BNode(),null);
            	}
            int Loca = data.getLocation().compareTo(r.getData().getLocation());
            while(Loca!=-1){
            	r.setRightChild(insert(r.rightChild(), data)); 
            	break;
            }
            while (Loca==-1)
            {r.setLeftChild(insert(r.leftChild(), data));
            break;
            }
            return r;
        }

 
public void setPredecessor(BNode r, Location key){
	//using recursive method to find predecessor
	{
	    if (r != null) {System.out.print("");};
		while(r.isLeaf()== false) {
	        setPredecessor(r.rightChild(),key);
	        while (predecessor== null){
	            while(r.getData().getLocation().compareTo(key)!= -1){
	                break;
	            }
	            while(r.getData().getLocation().compareTo(key)== -1){
	                predecessor = r.getData();
	                break;
	            }
	        break;
	        }
	        
	        setPredecessor(r.leftChild(), key);
	   break;
	    }
		
	}
	
}
public void setSuccessor(BNode r, Location key) {
	//using recursive method to find successor
	while(r.isLeaf()== true) {System.out.print("");break;}
	if(r.isLeaf()== false) {setSuccessor(r.leftChild(), key);
            while(r.getData().getLocation().compareTo(key)==1){
            	while(successor == null){
                successor = r.getData();
                break;
            }
            	break;
        }
        setSuccessor(r.rightChild(), key);
    }
}

public Pel largest(BNode r) throws EmptyTreeException {
	// find the largest
	boolean Leaf = r.isLeaf();
    while(Leaf== true) 
    {throw new EmptyTreeException("Empty"
    		+ "");}
    Pel lar = r.getData();
    while(r.rightChild().isLeaf()==false) {
        lar = r.rightChild().getData();
        r = r.rightChild();
        continue;
    }
    return lar;        
}
public Pel getSuccessor() {
	return successor;
}
public Pel getPredecessor() {
	return predecessor;
}
	
}
