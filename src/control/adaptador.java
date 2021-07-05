package control;
import model.*;

public final class adaptador {
	public static vetor3d de2dpara3d(vetor2d V) {
		return new vetor3d(V.getX(),V.getY(),0.0);
	}
}
