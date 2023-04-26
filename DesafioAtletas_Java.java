package Mod4;

import java.util.Locale;
import java.util.Scanner;

public class DesafioAtletas_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N =0;
		String nome = null;
		char sexo;
		double altura=0;

		double peso =0;
		double pesoMedioAtletas=0;
		double totalPesoMedioAtletas=0;


		double atletaMaisAlto=0;
		String nomeAtletaMaisAlto = null;

		double porcentoH=0;
		double totalporcentoH=0;

		double alturaMediaMulheres = 0;
		double somaMulheres =0;
		double totalAlturaMediaMulheres=0;

		System.out.print("Qual a quantidade de atletas?");
		N = sc.nextInt();

		for(int i=0;i<N;i++) {

			System.out.println("Digite os dados do atleta numero "+ (i+1) + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			nome = sc.nextLine();


			System.out.print("Sexo: ");
			sexo = sc.next().charAt(0);

			while(sexo != 'M' && sexo != 'F') {	
					
						System.out.print("Valor invalido! Favor digitar F ou M:");
						sexo = sc.next().charAt(0);
					
			}


			System.out.print("Altura: ");
			altura = sc.nextDouble();
			while(altura == 0 || altura<0) {
				System.out.print("Valor invalido! Favor digitar um valor positivo:");
				altura = sc.nextDouble();
			}

			if (sexo == 'M') {
				porcentoH = porcentoH+1;
			}
			else if(sexo == 'F') {
				alturaMediaMulheres = alturaMediaMulheres+altura;
				somaMulheres +=1;
			}	

			if (atletaMaisAlto < altura) {
				nomeAtletaMaisAlto = nome;
				atletaMaisAlto = altura;
			}
			else if (altura > atletaMaisAlto) {
				nomeAtletaMaisAlto = nome;
				atletaMaisAlto = altura;
			}


			System.out.print("Peso: ");
			peso = sc.nextDouble();
			while(peso == 0 || peso<0) {
				System.out.print("Valor invalido! Favor digitar um valor positivo:");
				peso = sc.nextDouble();
			}
			pesoMedioAtletas = pesoMedioAtletas + peso;
		}

		totalPesoMedioAtletas = pesoMedioAtletas/N;
		totalporcentoH = (porcentoH/N)*100;

		System.out.println();
		System.out.println("RELATÓRIO: ");
		System.out.printf("Peso médio dos atletas: %.2f \n",totalPesoMedioAtletas);
		System.out.println("Atleta mais alto: " + nomeAtletaMaisAlto);
		System.out.printf("Porcentagem de homens: %.1f %%\n", totalporcentoH);

		if(somaMulheres == 0) {
			System.out.println("Não há mulheres cadastradas");
		}
		else {
			totalAlturaMediaMulheres = alturaMediaMulheres/somaMulheres;
			System.out.printf("Altura média das mulheres: %.2f\n ",totalAlturaMediaMulheres);
		}


		sc.close();
	}

}