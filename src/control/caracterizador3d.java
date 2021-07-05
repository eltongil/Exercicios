package control;
import model.vetor3d;

public final class caracterizador3d {
	public static double modulo(vetor3d V) {
		double m = 0;
		m = V.getX()*V.getX()+V.getY()*V.getY()+V.getZ()*V.getZ();
		m = Math.sqrt(m);
		return m;
	}
	
}
