package model;

public class vetor3d implements exibir{
	private double x,y,z;
	public vetor3d(double X,double Y,double Z){
		x=X;
		y=Y;
		z=Z;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	@Override
	public void exibe() {
		System.out.println("("+this.getX()+","+this.getY()+","+this.getZ()+")");
	}
}
