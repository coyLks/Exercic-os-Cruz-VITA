package br.com.cruzvita;

import java.util.ArrayList;
import java.util.Collections;

public class Baralho {

    private ArrayList<Cartas> baralho;
    public Baralho() {
        baralho = new ArrayList<>();

        String[] cores = {"Vermelho", "Branco", "Azul", "Verde"};
        String[] valorCarta = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "K", "Q", "J"};


        for (String cor : cores) {
            for (String cartas : valorCarta) {
                baralho.add(new Cartas(cor, cartas));
            }
        }

        baralho.add(new Cartas("Coringa", "Coringa"));
        baralho.add(new Cartas("Coringa", "Coringa"));
        baralho.add(new Cartas("Coringa", "Coringa"));
        baralho.add(new Cartas("Coringa", "Coringa"));
        
    }
    
    public void embaralha() {
        Collections.shuffle(baralho);
    }
    
    public boolean temCarta() {
        return !baralho.isEmpty();
    }
    
    public Cartas darCarta() {
        if (temCarta()) {
            return baralho.remove(baralho.size()-1);
        } else {
            return null;
        }
    }
    
    public void imprimeBaralho() {
        for (Cartas carta : baralho) {
            System.out.println(carta.getNaipe() + " de " + carta.getNome());
        }
    }

	public void ImprimirBaralho() {
		// TODO Auto-generated method stub
		
	}
}
