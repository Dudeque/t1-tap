import java.util.ArrayList;
import java.util.List;

public class MensagemFactory {

    public static Mensagem criarMensagemTexto(String texto, Usuario remetente, Grupo grupo){
    	MensagemTexto mensagem = new MensagemTexto();
    	mensagem.setRemetente(remetente);
    	mensagem.setConteudo(texto);
    	mensagem.setVisualizaram(new ArrayList<Usuario>());
        mensagem.setGrupo(grupo);
    	return mensagem;
    }    

    public static Mensagem criarMensagemAudio(String tituloAudio, Usuario remetente, Grupo grupo){
    	MensagemAudio mensagem = new MensagemAudio();
    	mensagem.setRemetente(remetente);
    	mensagem.setConteudo(tituloAudio);
    	mensagem.setVisualizaram(new ArrayList<Usuario>());
        mensagem.setGrupo(grupo);
    	return mensagem;
    }    
    
    public static Mensagem criarMensagemImagem(String caminhoImagem, Usuario remetente, Grupo grupo){
    	MensagemImagem mensagem = new MensagemImagem();
    	mensagem.setRemetente(remetente);
    	mensagem.setConteudo(caminhoImagem);
    	mensagem.setVisualizaram(new ArrayList<Usuario>());
        mensagem.setGrupo(grupo);
    	return mensagem;
    }

    public static Mensagem criarMensagemVideo(String caminhoVideo, Usuario remetente, Grupo grupo){
    	MensagemVideo mensagem = new MensagemVideo();
    	mensagem.setRemetente(remetente);
    	mensagem.setConteudo(caminhoVideo);
    	mensagem.setVisualizaram(new ArrayList<Usuario>());
        mensagem.setGrupo(grupo);
    	return mensagem;
    }
}	