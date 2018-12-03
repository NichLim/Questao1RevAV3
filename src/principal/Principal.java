package principal;

import entidades.Lanche;
import entidades.MaquinaDeVenderLanches;
public class Principal {

	public static void main(String[] args) {
		Lanche sanduiche = new Lanche("sanduiche", 10.5);
		MaquinaDeVenderLanches maq = new MaquinaDeVenderLanches(sanduiche);
		
		System.out.println("e" + maq.getValorTotal());
		
		maq.venderLanche(11);
		maq.venderLanche(20);
			
		System.out.println(maq.getValorTotal());
		  
		
		
		

	}

}
