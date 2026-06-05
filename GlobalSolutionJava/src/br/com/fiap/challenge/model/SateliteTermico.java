package br.com.fiap.challenge.model;

public class SateliteTermico extends Satelite {
    private double sensibilidadeCalor; // em graus Celsius

    public SateliteTermico(String nome, int altitude, double sensibilidadeCalor) {
        super(nome, altitude);
        this.sensibilidadeCalor = sensibilidadeCalor;
    }

    // Sobrescrita (Polimorfismo)
    @Override
    public void executarVarredura() {
        System.out.println("🔥 Satélite Térmico [" + getNome() + "] escaneando assinaturas de calor infravermelho...");
    }

    public double getSensibilidadeCalor() { return sensibilidadeCalor; }
    public void setSensibilidadeCalor(double sensibilidadeCalor) { this.sensibilidadeCalor = sensibilidadeCalor; }
}