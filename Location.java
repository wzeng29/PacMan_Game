
public class Location {
	private int x;
    private int y;
    
public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}
public int getx() {
	return x;
}
public int gety() {
	return y;
}
public int compareTo (Location p) {
	if (this.gety() > p.gety()) return 1;
	else if ((this.gety() == p.gety())&&this.getx() >p.getx() ){
		   return 1;
	}
	else if(this.getx()== p.getx() && this.gety() == p.gety()){
		return 0;
	}
	else if (this.gety() < p.gety()){
		return -1;
	}
	while (this.gety() == p.gety() && this.getx() <p.getx()) {
			 return -1;
    }
	return 2;
}

}