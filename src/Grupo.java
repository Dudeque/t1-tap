import java.util.ArrayList;
import java.util.List;

public class Grupo {
    
	private int id;

    private String nome;
    private String descricao;
    private Usuario administrador;
    private List<Observer> membros;
    private List<Mensagem> mensagens;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Usuario getAdministrador() {
        return this.administrador;
    }

    public void setAdministrador(Usuario administrador) {
        this.administrador = administrador;
    }

    public List<Observer> getMembros() {
        return this.membros;
    }

    public void setMembros(List<Observer> membros) {
        this.membros = membros;
    }

    public List<Mensagem> getMensagens() {
        return this.mensagens;
    }

    public void setMensagens(List<Mensagem> mensagens) {
        this.mensagens = mensagens;
    }

    public void adicionarUsuario(Usuario administrador, Observer membro) {
        if (administrador == this.administrador) {
            membros.add(membro);
        }
    }

    public void removerUsuario(Observer membro) {
        membros.remove(membro);
    }

    public void notificar() {
        for (Observer membro : membros)
            membro.update(this);
            
        System.out.println();
    }

}