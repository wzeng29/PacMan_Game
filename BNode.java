/*Weiyi Zeng
 * 251263642
 * Assignment 4
 * Due Nov.20th
 */
public class BNode {
    private Pel data;
    private BNode parent;
    private BNode leftChild;
    private BNode rightChild;
    
    public BNode(Pel value, BNode left, BNode right, BNode parent) {
    	/*
    	 *  A constructor for
    the class. Stores the Pel value in the node and sets left child, right child, 
    and parent to the specified
    values.
    	 */
        this.data = value;
        this.leftChild = left;
        this.rightChild = right;
        this.parent = parent;
    }
    
    public BNode() {
    	/*
    	 *  A constructor for the class that initializes a leaf node. The data, children and
parent attributes are set to null.
    	 */
        this.data = null;
        this.leftChild = null;
        this.rightChild = null;
        this.parent = null;
    }

    public void setParent(BNode newParent) {
    	/*
    	 *  Returns the parent of this node
    	 */
        this.parent = newParent;
    }
    
    public void setLeftChild(BNode p) {
        this.leftChild = p;
    }
    
    
    public BNode parent() {
        return parent;
    }


    public BNode leftChild() {
        return leftChild;
    }

    
    public BNode rightChild() {
        return rightChild;
    }
    
    public boolean isLeaf() {
    	// Returns true if this node is a leaf; returns false otherwise.
        while((this.data==null)&&(this.leftChild == null)&&(this.rightChild == null)) {
        
        		return true;
        		
        	}
        
       
               return false;
    }
        
    public void setRightChild(BNode p) {
        this.rightChild = p;
    }

    public Pel getData() {
        return data;
    }

    public void setContent(Pel data) {
        this.data = data;
    }

    

}
