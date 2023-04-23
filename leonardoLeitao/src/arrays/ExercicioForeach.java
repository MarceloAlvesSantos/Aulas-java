package arrays;

import java.util.Arrays;

public class ExercicioForeach {
	
	public static void main(String[] args) {
		double notasAlunoA[] = new double[4];
		System.out.println(Arrays.toString(notasAlunoA));
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8.0;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		// Arrays.toString(notasAlunosA) =>  Anota��o importante
		System.out.println(Arrays.toString(notasAlunoA));
		
		System.out.println(notasAlunoA[notasAlunoA.length - 1]); // Usou isso para ter o �ltima nota do Array, M�todo longo
		
		double totalAlunoA = 0;
		for( double notasA: notasAlunoA ) { //notasAlunosA.length j� sabe o tamanho do ARRAY por causa do .length
			totalAlunoA += notasA;
		}
		
		System.out.println("M�dia: " + totalAlunoA/notasAlunoA.length);
		
		// Outra forma para inicializar um ARRAY
		final double notaArmazenada = 5.9;
		double notasAlunosB[] = { 6.9, 8.9, notaArmazenada , 10.0 }; 
		// for + Ctrl + espa�o , j� usar o for mais pr�ximo
		double totalAlunoB = 0;
		for ( double notasB: notasAlunosB) {
			totalAlunoB += notasB;
		}
		
		
		System.out.println("M�dia: " + totalAlunoB/notasAlunosB.length); //length a qui � um atributo, aui o tamanho � fixo 
	}

}
