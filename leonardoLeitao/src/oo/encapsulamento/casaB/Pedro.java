package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	
	void testeAcesso(){
		
		//System.out.println(segredo);
		//System.out.println(facoDentroDeCasa); // S� no mesmo pacote
		System.out.println(formaDeFalar); // acessando via eran�a, e n�o instanciando
		System.out.println(todosSabem);
		
	}

}
