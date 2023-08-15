package view;

import controller.MDCRecursivoController;

public class Principal {

	public static void main(String[] args) {
		        
		    	MDCRecursivoController mdcr = new MDCRecursivoController();
		    	
		    	int x = 20;
		        int y = 24;

		        int mdc = mdcr.calcularMDC(x, y);
		        
		        System.out.println("MDC de " + x + " e " + y + " é: " + mdc);
	}

}


