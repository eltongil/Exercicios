package view;
import model.*;
import control.*;

public class teste {

	public static void main(String[] args) {
		System.out.println("Criando vetor 2d");
		vetor2d v1 = new vetor2d(3.42,5.12);
		v1.exibe();
		double modulo = caracterizador3d.modulo(adaptador.de2dpara3d(v1));
		System.out.println("Seu módulo é "+modulo);

	}

}
