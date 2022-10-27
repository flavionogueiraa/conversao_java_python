package Correios;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		
	    Scanner ler = new Scanner(System.in);

        String entrada;
        System.out.println("Entrada: ");
        entrada = ler.next();
        
        Rastreamento pacote = new Rastreamento();
		pacote.rastrear(entrada);
		
	}


}
