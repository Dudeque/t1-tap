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

		grupo.getMensagens().add(mensagem);
		grupo.notificar();
	}

}