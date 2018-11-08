public class MensagemVideo extends Mensagem {
    
    public void imprimir() {
		System.out.println(this.getRemetente().getNome() + ": [Vídeo]" + this.getConteudo());
	}
}