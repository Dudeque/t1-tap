import java.util.ArrayList;
import java.util.List;

public abstract class Mensagem {

    private int id;

    private String conteudo;
    private Usuario remetente;
    private Grupo grupo;
    private Boolean cancelada;

    private List<Usuario> visualizaram;

    public int getId() {
        return this.id;
    }

	public void setId(int id) {
        this.id = id;
    }

    public String getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Usuario getRemetente() {
        return this.remetente;
    }

    public void setRemetente(Usuario remetente) {
        this.remetente = remetente;
    }

    public Grupo getGrupo() {
        return this.grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Boolean isCancelada() {
        return this.cancelada;
    }

    public void setCancelada(Boolean cancelada) {
        this.cancelada = cancelada;
    }

    public List<Usuario> getVisualizaram() {
        return this.visualizaram;
    }

    public void setVisualizaram(List<Usuario> visualizaram) {
        this.visualizaram = visualizaram;
    }
}