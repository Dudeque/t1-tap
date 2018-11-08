public class MensagemAudio extends Mensagem {

	public void imprimir() {
		System.out.println(this.getRemetente().getNome() + ": [Áudio]" + this.getConteudo());
	}
    
}