public class MensagemTexto extends Mensagem {
    
  public void imprimir() {
		System.out.println(this.getRemetente().getNome() + ": [Texto]" + this.getConteudo());
	}

}