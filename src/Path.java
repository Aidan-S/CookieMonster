
public class Path {

	int x;
	int y;
	int l;
	int s;
	
	Path(int a, int b, int c, int size){
		x = a;
		y = b;
		l = c;
		s = size;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getL() {
		return l;
	}
	
	public void setX(int b) {
		x = b;
	}
	
	public void setY(int b) {
		y = b;
	}
	
	public void setL(int b) {
		l = b;
	}
}
