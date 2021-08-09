package test4;

public class test09 {
	public static void main(String[] args) {
		
	}
}

class Point{
	int x, y;
	
	Point(int x, int y ){
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point{
	int z;
	
	Point3D(int x , int y , int z ){
		super(x,y);	// Point(int x, int y) 를 호출
		this.z = z;
	}
}
