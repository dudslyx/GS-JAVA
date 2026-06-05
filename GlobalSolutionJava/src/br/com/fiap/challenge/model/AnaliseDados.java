package br.com.fiap.challenge.model;

public class AnaliseDados {

    // MÉTODO 1: Analisar risco de incêndio baseado na resposta do usuário/dados do objeto
    public void analisarRiscoIncendio(Regiao regiao, SateliteTermico satelite) {
        satelite.executarVarredura();
        System.out.println("Analisando dados da região: " + regiao.getNome());

        if (regiao.getTemperaturaAtual() >= satelite.getSensibilidadeCalor()) {
            System.out.println("🚨 ALERTA CRÍTICO: Foco de incêndio detectado! Temperatura de " + regiao.getTemperaturaAtual() + "°C excede o limite.");
        } else {
            System.out.println("✅ Situação Controlada: Temperatura local de " + regiao.getTemperaturaAtual() + "°C está dentro da normalidade.");
        }
        System.out.println("----------------------------------------");
    }

    // MÉTODO 2: Verificar evolução de desmatamento
    public void verificarDesmatamento(Regiao regiao) {
        System.out.println("Verificando cobertura vegetal em: " + regiao.getNome());
        if (regiao.getIndiceDesmatamento() > 40.0) {
            System.out.println("🚨 ALERTA AMBIENTAL: Desmatamento severo detectado (" + regiao.getIndiceDesmatamento() + "%). Enviar equipe terrestre.");
        } else if (regiao.getIndiceDesmatamento() > 15.0) {
            System.out.println("⚠️ ATENÇÃO: Desmatamento moderado detectado (" + regiao.getIndiceDesmatamento() + "%). Monitorar área.");
        } else {
            System.out.println("🌲 Preservação estável: Apenas " + regiao.getIndiceDesmatamento() + "% de área afetada.");
        }
        System.out.println("----------------------------------------");
    }

    // MÉTODO 3: Simular recalibração de órbita do satélite (Ajuste de Atributo)
    public void calibrarOrbita(Satelite satelite, int novaAltitude) {
        System.out.println("Efetuando cálculos de telemetria espacial para " + satelite.getNome());
        if (novaAltitude < 300) {
            System.out.println("❌ Erro: Altitude muito baixa! Risco de reentrada na atmosfera terrestre.");
        } else {
            satelite.setAltitude(novaAltitude);
            System.out.println("🛰️ Órbita reajustada com sucesso! Nova altitude operacional: " + satelite.getAltitude() + " km.");
        }
        System.out.println("----------------------------------------");
    }

    // MÉTODO 4: Desativar satélite em caso de tempestade solar (Tomada de Decisão)
    public void avaliarClimaEspacial(Satelite satelite, String respostaUsuario) {
        System.out.println("Avaliando impacto de tempestade solar no satélite " + satelite.getNome());
        if (respostaUsuario.equalsIgnoreCase("Sim")) {
            satelite.setOperacional(false);
            System.out.println("⚠️ ALERTA: Satélite colocado em modo de hibernação preventiva de segurança!");
        } else {
            satelite.setOperacional(true);
            System.out.println("🟢 Satélite operando com carga total de energia.");
        }
        System.out.println("----------------------------------------");
    }
}