package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print(" Quantos alunos? ");
		int qAlunos = entrada.nextInt();
		
		System.out.print(" Quantas notas por aluno? ");
		int qNotas = entrada.nextInt();
		
		double notasAlunos[][] = new double [qAlunos][qNotas];
		System.out.println();
		double somaTotal = 0;
		for ( int i = 0; i < notasAlunos.length; i++) {
			for (int j = 0; j < notasAlunos[i].length; j++) {
				
				System.out.printf(" Informe a nota %d do %dª aluno: ", (j+1), (i+1));
				notasAlunos[i][j] = entrada.nextDouble();
				somaTotal += notasAlunos[i][j]; 
			}
			System.out.println();
			
		}
		double media = somaTotal / (qAlunos * qNotas);
		System.out.println(" Média da turma: " + media);
		
		System.out.println();
		//Forma simples de mostrar as notas da turma que estão na matriz
		for( double[] notasAluno: notasAlunos) {
			System.out.println(Arrays.toString(notasAluno));
		}
	
		entrada.close();
	}

}
