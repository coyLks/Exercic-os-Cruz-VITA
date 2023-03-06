package br.com.cruzvita;

public class Test {
	 public static void main(String[] args) {

		 Baralho jogo = new Baralho();
		 
		 jogo.embaralha();
		 jogo.ImprimirBaralho()
		 
		 while (jogo.temCarta()){
        Cartas baralho = jogo.darCarta();
         System.out.println( baralho.getNaipe() + " de " + baralho.getNome());
     }

 }
}