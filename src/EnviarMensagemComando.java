public class EnviarMensagemComando implements Comando {
	
	public Mensagem mensagem;

	public Mensagem getMensagem() {
		return this.mensagem;
	}
	
	public EnviarMensagemComando(Mensagem mensagem) {
		this.mensagem = mensagem;
	}

	public void executar() {
		Grupo grupo = mensagem.getGrupo();

		grupo.getMensagens().add(mensagem); // Adiciona mensagem à lista de mensagens do grupo
		grupo.notificar(); // Notifica os membros do grupo da chegada da mensagem
	}

}