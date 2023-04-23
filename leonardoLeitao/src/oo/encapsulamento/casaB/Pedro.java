package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	
	void testeAcesso(){
		
		//System.out.println(segredo);
		//System.out.println(facoDentroDeCasa); // Só no mesmo pacote
		System.out.println(formaDeFalar); // acessando via erança, e não instanciando
		System.out.println(todosSabem);
		
	}

}
