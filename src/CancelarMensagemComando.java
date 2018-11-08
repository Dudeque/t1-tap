public class CancelarMensagemComando implements Comando {
	
	private Mensagem mensagem;

	public Mensagem getMensagem() {
		return this.mensagem;
	}

	public CancelarMensagemComando(Mensagem mensagem) {
		this.mensagem = mensagem;
	}

	public void executar() {
		mensagem.setCancelada(true);
	}

}