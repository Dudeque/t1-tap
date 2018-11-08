public class MensagemImagem extends Mensagem {
 
  public void imprimir() {
		System.out.println(this.getRemetente().getNome() + ": [Imagem]" + this.getConteudo());
	}

}