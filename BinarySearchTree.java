/*Weiyi Zeng
 * 251263642
 * Assignment 4
 * Due Nov.20th
 */
public class BinarySearchTree implements BinarySearchTreeADT{
    private BNode root;
/*
 * This class implements an ordered dictionary using a binary search tree. Each node of the tree will store a Pel
object; the attribute Location of the Pel object stored in a node will be its key attribute. In a binary search
tree only the internal nodes will store information. The leaves are nodes (leaves are not null)
that do not store any data.    
 */
public BinarySearchTree() {
	// create a tree whose root is a leaf node
        root = new BNode();
    }
public Pel get(BNode r, Location key) {
//  Returns the Pel object storing the given key, if the
//	key is stored in the tree; returns null otherwise.
    	if(r.isLeaf()==false) {
        	while(r.getData().getLocation().compareTo(key)==0){
            return r.getData();
        }
        if(key.compareTo(r.getData().getLocation())==-1) {
             	return get(r.leftChild(), key);
        }
        else{
        	return get(r.rightChild(), key);
        	}
        }
        while(r.isLeaf()!=false) {
        	return null;
        	}
        return null;
    }
       
  
public void put(BNode r, Pel data) throws DuplicatedKeyException {
	// Inserts newData in the tree if no data item with the same key is already there; if a node already stores the same
	// key, the algorithm throws a DuplicatedKeyException.
if(this.get(r, data.getLocation())==null) {
	System.out.print("");
}
	
	else{
        	throw new DuplicatedKeyException("Duplicated");
        }
        getLeaf<BinarySearchTree> s = new getLeaf<BinarySearchTree>();
        root = s.insert(r, data);
    }




public void remove(BNode r, Location key) throws InexistentKeyException {
	/*
	 *  Removes the data item with the given key, if the key is stored in the tree; throws an InexistentKeyException
otherwise.
	 */
        if(get(r,key)!=null) System.out.print("");
        else throw new InexistentKeyException("Inexistent");
        
        getLeaf<BinarySearchTree> s = new getLeaf<BinarySearchTree>();
        try {
			root =  s.remove(r,key);
		} catch (InexistentKeyException | EmptyTreeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        finally {};
    }
    
public Pel successor(BNode r, Location key) {
	// Returns the Pel object with the smallest key
	//larger than the given one (note that the tree does not need to store a node with the given key). Returns
	//null if the given key has no successor.
        getLeaf<BinarySearchTree> s = new getLeaf<BinarySearchTree>();
	    s.setSuccessor(r, key);
        return s.getSuccessor();
    }

public Pel predecessor(BNode r, Location key) {
/*
 * Returns the Pel object with the largest
key smaller than the given one (note that the tree does not need to store a node with the given key).
Returns null if the given key has no predecessor.
 */
	getLeaf<BinarySearchTree> s = new getLeaf<BinarySearchTree>();
	    s.setPredecessor(r, key);
	
        return s.getPredecessor();
    }

public Pel smallest(BNode r) throws EmptyTreeException {
    	boolean L = r.leftChild().isLeaf();
        while(r.isLeaf()) {
        	throw new EmptyTreeException("EmptyTree");
        	}
        Pel smallest = r.getData();
        while(!L) {
            smallest = r.leftChild().getData();
            r = r.leftChild();
            continue;
        }
        return smallest;
    }

public Pel largest(BNode r) throws EmptyTreeException {
    	boolean Leaf = r.isLeaf();
    	Pel lar = r.getData();
        while(Leaf) {throw new EmptyTreeException("Empty"
        		+ "");}
        while(r.rightChild().isLeaf()==false) {
            lar = r.rightChild().getData();
            r = r.rightChild();
            continue;
        }
        return lar;        
    }  
public BNode getRoot() {
	//return root
        return root;
    }
    
}
