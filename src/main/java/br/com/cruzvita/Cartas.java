package br.com.cruzvita;

public class Cartas {

    private String nome;
    private String cores;

    public Cartas(String nome, String naipe) {
        this.nome = nome;
        this.cores = naipe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNaipe() {
        return cores;
    }

    public void setNaipe(String naipe) {
        this.cores = naipe;
    }
}
