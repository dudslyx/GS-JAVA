package br.com.fiap.challenge.model;

public abstract class Satelite {
    private String nome;
    private int altitude; // em km
    private boolean operacional;

    // Construtor
    public Satelite(String nome, int altitude) {
        this.nome = nome;
        this.altitude = altitude;
        this.operacional = true;
}
    // Método Polimórfico (será sobrescrito nas filhas)
    public abstract void executarVarredura();

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getAltitude() { return altitude; }
    public void setAltitude(int altitude) { this.altitude = altitude; }
    public boolean isOperacional() { return operacional; }
    public void setOperacional(boolean operacional) { this.operacional = operacional; }
}
