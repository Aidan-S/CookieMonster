import java.util.Stack;

public class CookieMonster {
	
	Stack<Path> tower;
	int soFar;
	int Max;
	int[][] cookies = new int[][]{
		  {1,  3,  0,  5, -1,  7, -1, -1,  0,  4,  2,  1},
		  {-1,  3,  2,  1, -1,  4, -1,  5,  3, -1,  1,  0},
		  {5,  4,  8, -1,  3,  2,  2, -1,  4, -1,  0,  0},
		  {2,  1,  0,  4,  1, -1,  8,  0,  2, -1,  2,  5},
		  { 1,  4,  0,  1, -1,  0,  3,  2,  2,  4,  1,  4},
		  { 0,  1,  4,  1,  1,  6,  1,  4,  5,  2,  1,  0},
		  { 3,  2,  5 , 2 , 0,  7, -1,  2,  1,  0, -1,  3},
		  { 0, -1,  4 ,-1 ,-1 , 3 , 5 , 1,  4,  2,  1,  2}, 
		  { 5,  4,  8, -1,  3,  2,  2, -1,  4, -1,  0,  0},
		  { 2,  1,  0,  4,  1, -1,  8,  0,  2, -1,  2,  5},
		  {1 , 3,  0,  5, -1 , 7 ,-1 ,-1,  0,  4 , 2 , 1 },
		  {0 , 0 , 3,  1,  5 , 2 , 1 , 5 , 4 , 1 , 3,  3},
		};
	int size = cookies[0].length + cookies.length - 1;
	Path p = new Path(0, 0, size, 0);
		
		
	CookieMonster(){
		int s = 0;
		while(s < size) {
			soFar += cookies[p.getX()][p.getY()];
			
			if(cookies[p.getX()][p.getY()+1] != -1) {
				p.setX(p.getX()+1);
			}
			
			if(cookies[p.getX()+1][p.getY()] != -1) {
				Path t = p;
				tower.push(t);
			}
			
		}
	}
		
	
}
