import java.util.ArrayList;
import java.util.List;

public class MensagemFactory {

    public static Mensagem criarMensagemTexto(String texto, Usuario remetente){
    	MensagemTexto mensagem = new MensagemTexto();
    	mensagem.setRemetente(remetente);
    	mensagem.setConteudo(texto);
    	mensagem.setVisualizaram(new ArrayList<Usuario>());
    	return mensagem;
    }    

    public static Mensagem criarMensagemAudio(String tituloAudio, Usuario remetente){
    	MensagemAudio mensagem = new MensagemAudio();
    	mensagem.setRemetente(remetente);
    	mensagem.setConteudo(tituloAudio);
    	mensagem.setVisualizaram(new ArrayList<Usuario>());
    	return mensagem;
    }    
    
    public static Mensagem criarMensagemImagem(String caminhoImagem, Usuario remetente){
    	MensagemImagem mensagem = new MensagemImagem();
    	mensagem.setRemetente(remetente);
    	mensagem.setConteudo(caminhoImagem);
    	mensagem.setVisualizaram(new ArrayList<Usuario>());
    	return mensagem;
    }

    public static Mensagem criarMensagemVideo(String caminhoVideo, Usuario remetente){
    	MensagemVideo mensagem = new MensagemVideo();
    	mensagem.setRemetente(remetente);
    	mensagem.setConteudo(caminhoVideo);
    	mensagem.setVisualizaram(new ArrayList<Usuario>());
    	return mensagem;
    }
}	