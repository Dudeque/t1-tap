import java.util.ArrayList;
import java.util.List;

public abstract class Mensagem {
    private String conteudo;

    private Usuario remetente;
    private Grupo grupo;
    private List<Usuario> visualizaram;
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

    public Grupo getGrupo() {
        return this.remetente;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public List<Usuario> getVisualizaram() {
        return this.visualizaram;
    }

    public void setVisualizaram(List<Usuario> visualizaram) {
        this.visualizaram = visualizaram;
    }
}