package ch05.exam_05;

public class Point3D extends Point
{
	private int z;
		private String color;
		public Point3D() {this(0,0,0);}
		public Point3D(int x) {this(x,0,0);}
		public Point3D(int x,int y) {this(x,y,0);}
		public Point3D(int x, int y, int z){
			super(x, y);
			this.z=z;
		}
		public String toString() {
			return "("+this.getX()+","+this.getY()+","+this.z+")의 점";
		}
		public void moveUP() {z++;}
		public void moveDown() {z--;}
		public void move(int x, int y, int z) {
			super.move(x, y);
			this.z=z;
		}
}
