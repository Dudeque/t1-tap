import java.util.ArrayList;
import java.util.List;

public class MensagemFactory {

    private static int ultimoId = 0; // Guarda o último ID cadastrado + 1

	private static void setValoresComuns(Usuario remetente, Grupo grupo, Mensagem mensagem) {
        // Instanciação e criação da mensagem
		mensagem.setRemetente(remetente);
		mensagem.setVisualizaram(new ArrayList<Usuario>());
		mensagem.setGrupo(grupo);
		mensagem.setCancelada(false);

        // Atribui o valor do atributo estático ultimoId para o ID da mensagem recém criada
		mensagem.setId(MensagemFactory.ultimoId);

        // Incrementa o ID
		MensagemFactory.ultimoId++;
	}

    public static Mensagem criarMensagemTexto(String texto, Usuario remetente, Grupo grupo){
        // Instancia mensagem de texto
        MensagemTexto mensagem = new MensagemTexto();
        mensagem.setConteudo(texto);
        setValoresComuns(remetente, grupo, mensagem);
        return mensagem;
    }

    public static Mensagem criarMensagemAudio(String tituloAudio, Usuario remetente, Grupo grupo) {
        // Instancia mensagem de áudio
        MensagemAudio mensagem = new MensagemAudio();
        mensagem.setConteudo(tituloAudio);
        setValoresComuns(remetente, grupo, mensagem);
        return mensagem;
    }    
    
    public static Mensagem criarMensagemImagem(String caminhoImagem, Usuario remetente, Grupo grupo){
        // Instancia mensagem de imagem
        MensagemImagem mensagem = new MensagemImagem();
        mensagem.setConteudo(caminhoImagem);
        setValoresComuns(remetente, grupo, mensagem);
        return mensagem;
    }

    public static Mensagem criarMensagemVideo(String caminhoVideo, Usuario remetente, Grupo grupo){
    	// Instancia mensagem de vídeo
    	MensagemVideo mensagem = new MensagemVideo();
    	mensagem.setConteudo(caminhoVideo);
    	setValoresComuns(remetente, grupo, mensagem);
    	return mensagem;
    }
}	