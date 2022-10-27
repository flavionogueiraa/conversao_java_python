package Correios;

import java.util.InputMismatchException;

public class Rastreamento {
	
	
	 public static boolean isCPF(String CPFdestinatario) {
	        if (CPFdestinatario.equals("00000000000") ||
	        	CPFdestinatario.equals("11111111111") ||
	        	CPFdestinatario.equals("22222222222") || CPFdestinatario.equals("33333333333") ||
	        	CPFdestinatario.equals("44444444444") || CPFdestinatario.equals("55555555555") ||
	        	CPFdestinatario.equals("66666666666") || CPFdestinatario.equals("77777777777") ||
	        	CPFdestinatario.equals("88888888888") || CPFdestinatario.equals("99999999999") ||
	           (CPFdestinatario.length() != 11))
	            return(false);

	        char dig10, dig11;
	        int sm, i, r, num, peso;

	        try {
	            sm = 0;
	            peso = 10;
	            for (i=0; i<9; i++) {
	            num = (int)(CPFdestinatario.charAt(i) - 48);
	            sm = sm + (num * peso);
	            peso = peso - 1;
	            }

	            r = 11 - (sm % 11);
	            if ((r == 10) || (r == 11))
	                dig10 = '0';
	            else dig10 = (char)(r + 48); 

	            sm = 0;
	            peso = 11;
	            for(i=0; i<10; i++) {
	            num = (int)(CPFdestinatario.charAt(i) - 48);
	            sm = sm + (num * peso);
	            peso = peso - 1;
	            }

	            r = 11 - (sm % 11);
	            if ((r == 10) || (r == 11))
	                 dig11 = '0';
	            else dig11 = (char)(r + 48);

	            if ((dig10 == CPFdestinatario.charAt(9)) && (dig11 == CPFdestinatario.charAt(10)))
	                 return(true);
	            else return(false);
	                } catch (InputMismatchException erro) {
	                return(false);
	            }
	        }

	        public static String imprimeCPF(String CPFdestinatario) {
	            return(CPFdestinatario.substring(0, 3) + "." + CPFdestinatario.substring(3, 6) + "." +
	            		CPFdestinatario.substring(6, 9) + "-" + CPFdestinatario.substring(9, 11));
	        }
	    
	
    public void rastrear(String pacote) {

       
        System.out.printf("\nResultado: ");
        if (isCPF(pacote) == true) {
           System.out.printf("%s\n",imprimeCPF(pacote));
           ConcreteNumeroCPFCliente rastreio = new ConcreteNumeroCPFCliente();
           rastreio.rastrearObjeto();
        }
        else { 
      	  ConcreteNumeroDoPacote rastreio = new ConcreteNumeroDoPacote();
            rastreio.rastrearObjeto();
      	  
        }
  }
	
}
