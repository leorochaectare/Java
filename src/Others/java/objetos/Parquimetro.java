package Others.java.objetos;

import java.util.Timer;
import java.util.TimerTask;

public class Parquimetro {
	
	private long inicioEstacionamento;
	private long tempoLimite;
	private String cliente;
	
	public Parquimetro() {
		
	}
	
	 public Parquimetro(String cliente, int tempoMaximoHoras) {
	        this.cliente = cliente;
	        this.inicioEstacionamento = System.currentTimeMillis();
	        this.tempoLimite = inicioEstacionamento + tempoMaximoHoras * 60 * 60 * 1000; // Tempo limite em milissegundos
	    }
	
	public void iniciarTemporizador() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                long tempoDecorrido = System.currentTimeMillis() - inicioEstacionamento;
                if (tempoDecorrido >= 60 * 60 * 1000) {
                    // Uma hora se passou, enviar aviso ao cliente e atualizar o tempo limite
                    enviarAvisoCliente();
                    tempoLimite += 60 * 60 * 1000; // Acrescentar mais uma hora
                }
            }
        }, 0, 60000); // Verificar a cada minuto
    }
	
	private void enviarAvisoCliente() {
        System.out.println("Aviso enviado ao cliente: Uma hora se passou, será acrescentada mais uma hora.");
    }


}
