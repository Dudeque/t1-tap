public class Grupo {
    
    private String nome;
    private String descricao;
    private Usuario administrador;
    private List<Observer> membros;
    private List<Mensagem> mensagens;

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

}