package br.com.fiap.challenge.model;

public class Regiao {
    private String nome;
    private double temperaturaAtual;
    private double indiceDesmatamento; // 0.0 a 100.0%

    public Regiao(String nome, double temperaturaAtual, double indiceDesmatamento) {
        this.nome = nome;
        this.temperaturaAtual = temperaturaAtual;
        this.indiceDesmatamento = indiceDesmatamento;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public double getTemperaturaAtual() { return temperaturaAtual; }
    public void setTemperaturaAtual(double temperaturaAtual) { this.temperaturaAtual = temperaturaAtual; }
    public double getIndiceDesmatamento() { return indiceDesmatamento; }
    public void setIndiceDesmatamento(double indiceDesmatamento) { this.indiceDesmatamento = indiceDesmatamento; }
}