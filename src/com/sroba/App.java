package com.sroba;

import com.sroba.facade.CheckFacade;

public class App {
	
	public static void main(String[] args) {
		CheckFacade cliente1 = new CheckFacade();
		cliente1.buscarBook("El perfume", "jonh Ericht", "Drama", 1928);
		
		CheckFacade cliente2 = new CheckFacade();
		cliente2.buscarBook("Cien a�os de Soledad", "Gabriel Garc�a Marquez", "Drama", 1967);
	}
}
