package br.com.fiap.challenge.view;

import br.com.fiap.challenge.model.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        AnaliseDados sistemaAnalise = new AnaliseDados();

        System.out.println("==================================================");
        System.out.println("🛸 INICIALIZANDO SISTEMA ESPACIAL - ECO-WATCH FIAP");
        System.out.println("==================================================");

        // Instanciando os Satélites e a Região da Terra para testes
        SateliteTermico satCalor = new SateliteTermico("Aqua-NASA", 705, 45.0); // Alerta acima de 45°C
        SateliteRadar satRadar = new SateliteRadar("Sentinel-1", 693, "Banda C");
        Regiao amazonia = new Regiao("Amazônia Legal - Setor Norte", 32.0, 12.5);

        // --- INTERAÇÃO COM O USUÁRIO ---
        System.out.print("Digite a temperatura atual detectada na Amazônia (°C): ");
        double tempDigitada = leitor.nextDouble();
        amazonia.setTemperaturaAtual(tempDigitada);

        System.out.print("Digite o índice de desmatamento atual da região (0 a 100): ");
        double desmatDigitado = leitor.nextDouble();
        amazonia.setIndiceDesmatamento(desmatDigitado);

        System.out.println("\n--- INICIANDO PROCESSAMENTO DOS MÉTODOS OPERACIONAIS ---\n");

        // Executando Método Operacional 1 (Risco de Incêndio)
        sistemaAnalise.analisarRiscoIncendio(amazonia, satCalor);

        // Executando Método Operacional 2 (Verificação de Desmatamento)
        sistemaAnalise.verificarDesmatamento(amazonia);

        // Executando Método Operacional 3 (Calibração de Órbita)
        System.out.print("Defina a nova altitude para o satélite " + satRadar.getNome() + " (em km): ");
        int novaAlt = leitor.nextInt();
        sistemaAnalise.calibrarOrbita(satRadar, novaAlt);

        // Executando Método Operacional 4 (Clima Espacial com Polimorfismo de Sobrecarga)
        System.out.print("Há alertas de radiação ou tempestade solar ativa? (Sim/Não): ");
        String respostaClima = leitor.next();
        sistemaAnalise.avaliarClimaEspacial(satCalor, respostaClima);

        // Demonstrando Polimorfismo de Sobrecarga do Satélite Radar
        System.out.println("Testando recursos adicionais do Radar:");
        satRadar.executarVarredura(5); // Chama o método sobrecarregado

        System.out.println("\n==================================================");
        System.out.println("ESTADO FINAL DOS EQUIPAMENTOS E ATRIBUTOS:");
        System.out.println("Satélite " + satCalor.getNome() + " operacional? " + (satCalor.isOperacional() ? "SIM" : "NÃO (Modo de Segurança)"));
        System.out.println("Altitude atual do " + satRadar.getNome() + ": " + satRadar.getAltitude() + " km");
        System.out.println("==================================================");

        leitor.close();
    }
}