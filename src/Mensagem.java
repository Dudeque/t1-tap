import java.util.ArrayList;
import java.util.List;

public abstract class Mensagem {
    private String mensagem;
    private Usuario remetente;
    private List<Usuario> visualizaram;
    private String conteudo;

    public String getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getMensagem() {
        return this.mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Usuario getRemetente() {
        return this.remetente;
    }

    public void setRemetente(Usuario remetente) {
        this.remetente = remetente;
    }

    public List<Usuario> getVisualizaram() {
        return this.visualizaram;
    }

    public void setVisualizaram(List<Usuario> visualizaram) {
        this.visualizaram = visualizaram;
    }
}