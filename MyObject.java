/*Weiyi Zeng
 * 251263642
 * Assignment 4
 * Due Nov.20th
 */
public class MyObject implements MyObjectADT {

    private int id;
    private int width;
    private int height;
    private String type;
    private Location pos;
    
    private BinarySearchTree tree;
    
    public MyObject (int id, int width, int height, String type, Location pos) {
    	//constructor, create an empty BinarySearchTree
        tree = new BinarySearchTree();
        this.id = id;
        this.width = width;
        this.height = height;
        this.type = type;
        this.pos = pos;
    }
        
    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public String getType() {
        return this.type;
    }

    public int getId() {
        return this.id;
    }

    public Location getLocus() {
        return this.pos;
    }

    public boolean intersects(MyObject fig) {
    	/*
    	 *  Returns true if this MyObject intersects the one specified in the parameter. It returns false otherwise. Read the next section to learn how
to detect intersections between objects.
    	 */
     
            Pel inter = new Pel(pos, height);
			
				try {
					inter = tree.smallest(tree.getRoot());
				} catch (EmptyTreeException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally {System.out.print("");}
            int com = inter.getLocation().compareTo(fig.getLocus());
            while (com!=0) return true;
            inter = tree.successor(tree.getRoot(), inter.getLocation());
            while(inter != null) {
                if(com==0) {return true;}
                inter = tree.successor(tree.getRoot(), inter.getLocation());
            }
            return false;
        

    }
    public void setLocus(Location value) {
        this.pos = value;
    }

    public void setType(String t) {
        this.type = t;
    }

    public void addPel(Pel pix) throws DuplicatedKeyException {
    	/*
    	 * throws DuplicatedKeyException: Inserts pix into the binary
search tree associated with this MyObject. Throws a DuplicatedKeyException if an error occurs
when inserting the Pel object pix into the tree.
    	 */
    
    	/*
    	 * using BinaryReasearchTree class
    	 */
       tree.put(tree.getRoot(), pix);
    }
      
        
    
			
    
}
