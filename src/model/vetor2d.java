package model;

public class vetor2d implements exibir{
	private double x,y;
	public vetor2d(double X,double Y){
		x=X;
		y=Y;
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
	@Override
	public void exibe() {
		System.out.println("("+this.getX()+","+this.getY()+")");
	}
}
