package Client;

import java.util.Scanner;
import Model.Algarismo;

public class ClassePrincipal {
	public static void main(String[] args) {
		  String numExtenso = "";
	      int resp;

	        Scanner scan = new Scanner(System.in); // instanciando objeto da classe scan
	        int num;
	        String numeroString;
	        Algarismo umAlgarismo[] = {new Algarismo("zero"), new Algarismo("um"), new Algarismo("dois"),new Algarismo("três"),new Algarismo("quatro"), new Algarismo("cinco"), new Algarismo("seis"), new Algarismo("sete"), new Algarismo("oito"), new Algarismo("nove")};
	        Algarismo doisAlgarismosDez[] = { new Algarismo("dez"), new Algarismo("onze"), new Algarismo("doze"), new Algarismo("treze"), new Algarismo("catorze"), new Algarismo("quinze"), new Algarismo("dezesseis"), new Algarismo("dezessete"),new Algarismo("dezoito"), new Algarismo("dezoneve") };
	        Algarismo doisAlgarismosDezenas[] = { new Algarismo("dez"), new Algarismo("vinte"), new Algarismo("trinta"), new Algarismo("quarenta"), new Algarismo("cinquenta"), new Algarismo("sessenta"), new Algarismo("setenta"), new Algarismo("oitenta"), new Algarismo("noventa")};

	        do {
	            do {
	                System.out.println("Digite um número entre 0 e 100");
	                num = scan.nextInt(); // lendo um número inteiro
	            } while (num < 0 || num > 100);

	            numeroString = Integer.toString(num); // converte o número inteiro p String

	            char[] algarismos = numeroString.toCharArray(); // converterdo numeroString em um array de caracteres

	            int indice;

	            if (algarismos.length == 3) {
	                numExtenso = "cem";
	            } else if (algarismos.length == 1) {
	                indice = Character.getNumericValue(algarismos[0]);
	                numExtenso = umAlgarismo[indice].getValExtenso();
	            } else if (algarismos.length == 2) {
	                if (algarismos[1] == '0') {
	                    indice = Character.getNumericValue(algarismos[0]) - 1;
	                    numExtenso = doisAlgarismosDezenas[indice].getValExtenso();
	                } else if (algarismos[0] == '1') {
	                    indice = Character.getNumericValue(algarismos[1]);
	                    numExtenso = doisAlgarismosDez[indice].getValExtenso();
	                } else if (algarismos[0] == '2') {
	                    indice = Character.getNumericValue(algarismos[1]);
	                    numExtenso = doisAlgarismosDezenas[1].getValExtenso() + " e " + umAlgarismo[indice].getValExtenso();
	                } else if (algarismos[0] == '3') {
	                    indice = Character.getNumericValue(algarismos[1]);
	                    numExtenso = doisAlgarismosDezenas[2].getValExtenso() + " e " + umAlgarismo[indice].getValExtenso();
	                } else if (algarismos[0] == '4') {
	                    indice = Character.getNumericValue(algarismos[1]);
	                    numExtenso = doisAlgarismosDezenas[3].getValExtenso() + " e " + umAlgarismo[indice].getValExtenso();
	                } else if (algarismos[0] == '5') {
	                    indice = Character.getNumericValue(algarismos[1]);
	                    numExtenso = doisAlgarismosDezenas[4].getValExtenso() + " e " + umAlgarismo[indice].getValExtenso();
	                } else if (algarismos[0] == '6') {
	                    indice = Character.getNumericValue(algarismos[1]);
	                    numExtenso = doisAlgarismosDezenas[5].getValExtenso() + " e " + umAlgarismo[indice].getValExtenso();
	                } else if (algarismos[0] == '7') {
	                    indice = Character.getNumericValue(algarismos[1]);
	                    numExtenso = doisAlgarismosDezenas[6].getValExtenso() + " e " + umAlgarismo[indice].getValExtenso();
	                } else if (algarismos[0] == '8') {
	                    indice = Character.getNumericValue(algarismos[1]);
	                    numExtenso = doisAlgarismosDezenas[7].getValExtenso() + " e " + umAlgarismo[indice].getValExtenso();
	                } else if (algarismos[0] == '9') {
	                    indice = Character.getNumericValue(algarismos[1]);
	                    numExtenso = doisAlgarismosDezenas[8].getValExtenso() + " e " + umAlgarismo[indice].getValExtenso();
	                }

	            }
	            System.out.println("Número: " + numExtenso);
	            System.out.println("Deseja continuar? 1 para sim, qualquer outro número para não");
	            resp = scan.nextInt();
	        } while (resp == 1);
	}
}