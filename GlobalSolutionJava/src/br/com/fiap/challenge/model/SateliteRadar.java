package br.com.fiap.challenge.model;

public class SateliteRadar extends Satelite {
    private String frequenciaBanda; // ex: "Banda X", "Banda C"

    public SateliteRadar(String nome, int altitude, String frequenciaBanda) {
        super(nome, altitude);
        this.frequenciaBanda = frequenciaBanda;
    }

    // Sobrescrita (Polimorfismo)
    @Override
    public void executarVarredura() {
        System.out.println("📡 Satélite Radar [" + getNome() + "] emitindo pulsos eletromagnéticos através das nuvens...");
    }

    // Sobrecarga (Polimorfismo no mesmo método com parâmetros diferentes)
    public void executarVarredura(int modoPotencia) {
        System.out.println("📡 Varredura de alta precisão ativada no nível de potência: " + modoPotencia);
    }

    public String getFrequenciaBanda() { return frequenciaBanda; }
    public void setFrequenciaBanda(String frequenciaBanda) { this.frequenciaBanda = frequenciaBanda; }
}