import java.util.ArrayList;
import java.util.List;

public class MensagemFactory {

    private static int ultimoId = 0;

	private static void setValoresComuns(Usuario remetente, Grupo grupo, Mensagem mensagem) {
		mensagem.setRemetente(remetente);
		mensagem.setVisualizaram(new ArrayList<Usuario>());
		mensagem.setGrupo(grupo);
		mensagem.setCancelada(false);
		mensagem.setId(MensagemFactory.ultimoId);

		MensagemFactory.ultimoId++;
	}

    public static Mensagem criarMensagemTexto(String texto, Usuario remetente, Grupo grupo){
    	MensagemTexto mensagem = new MensagemTexto();
    	mensagem.setConteudo(texto);
    	setValoresComuns(remetente, grupo, mensagem);
    	return mensagem;
    }

	public static Mensagem criarMensagemAudio(String tituloAudio, Usuario remetente, Grupo grupo) {
    	MensagemAudio mensagem = new MensagemAudio();
    	mensagem.setConteudo(tituloAudio);
    	setValoresComuns(remetente, grupo, mensagem);
    	return mensagem;
    }    
    
    public static Mensagem criarMensagemImagem(String caminhoImagem, Usuario remetente, Grupo grupo){
    	MensagemImagem mensagem = new MensagemImagem();
    	mensagem.setConteudo(caminhoImagem);
    	setValoresComuns(remetente, grupo, mensagem);
    	return mensagem;
    }

    public static Mensagem criarMensagemVideo(String caminhoVideo, Usuario remetente, Grupo grupo){
    	MensagemVideo mensagem = new MensagemVideo();
    	mensagem.setConteudo(caminhoVideo);
    	setValoresComuns(remetente, grupo, mensagem);
    	return mensagem;
    }
}	