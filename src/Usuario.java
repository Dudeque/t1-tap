import java.util.ArrayList;
import java.util.List;	

public class Usuario implements Observer {

	private int id;

    private String nome;
    private String numero;
    private String status;
    private String foto;
    private List<Grupo> grupos;
    private List<Comando> cancelarMensagemComandos;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
	}
	
	public String getNome()
	{
		return this.nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getNumero()
	{
		return this.numero;
	}

	public void setNumero(String numero)
	{
		this.numero = numero;
	}

	public String getStatus()
	{
		return this.status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public String getFoto()
	{
		return this.foto;
	}

	public void setFoto(String foto)
	{
		this.foto = foto;
	}

	public List<Grupo> getGrupos()
	{
		return this.grupos;
	}

	public void setGrupos(List<Grupo> grupos)
	{
		this.grupos = grupos;
	}

	public List<Comando> getCancelarMensagemComandos()
	{
		return this.cancelarMensagemComandos;
	}

	public void setCancelarMensagemComandos(List<Comando> cancelarMensagemComandos)
	{
		this.cancelarMensagemComandos = cancelarMensagemComandos;
	}

	public void update(Grupo grupo)
	{
		System.out.println(this.nome + " recebeu mensagem no grupo " + grupo.getNome());
	}

	public void adicionarUsuarioGrupo(Usuario usuario, Grupo grupo)
	{
		grupo.adicionarUsuario(this, (Observer)usuario);
	} 

	public void adicionarUsuariosGrupo(Usuario usuarios[], Grupo grupo)
	{
		for (Usuario usuario : usuarios)
			adicionarUsuarioGrupo(usuario, grupo);
	} 

	private void enviarMensagem(Mensagem mensagem) {
		Comando enviarMensagem = new EnviarMensagemComando(mensagem);
		Comando cancelarMensagem = new CancelarMensagemComando(mensagem);
		
		enviarMensagem.executar();
		this.cancelarMensagemComandos.add(cancelarMensagem);
	}

	public int enviarMensagemTexto(Grupo grupo, String texto) {
		Mensagem mensagem = MensagemFactory.criarMensagemTexto(texto, this, grupo);
		enviarMensagem(mensagem);
		return mensagem.getId();
	}

	public int enviarMensagemAudio(Grupo grupo, String tituloAudio) {
		Mensagem mensagem = MensagemFactory.criarMensagemAudio(tituloAudio, this, grupo);
		enviarMensagem(mensagem);
		return mensagem.getId();
	}

	public int enviarMensagemVideo(Grupo grupo, String caminhoVideo) {
		Mensagem mensagem = MensagemFactory.criarMensagemVideo(caminhoVideo, this, grupo);
		enviarMensagem(mensagem);
		return mensagem.getId();
	}

	public int enviarMensagemImagem(Grupo grupo, String caminhoImagem) {
		Mensagem mensagem = MensagemFactory.criarMensagemImagem(caminhoImagem, this, grupo);
		enviarMensagem(mensagem);
		return mensagem.getId();
	}

	public void visualizarGrupo(Grupo grupo) {

		System.out.println("[Visão do " + this.getNome() + "]");
		System.out.println("Mensagens do grupo " + grupo.getNome());
		
		List<Mensagem> mensagensGrupo = grupo.getMensagens();
		
		for (Mensagem mensagem : mensagensGrupo) {
			List<Usuario> visualizaramMensagem = mensagem.getVisualizaram();
			if (mensagem.isCancelada()) {
				if (visualizaramMensagem.contains(this)) {
					System.out.println(mensagem.getRemetente().getNome() + ": " +mensagem.getConteudo());
				}
			} else {
				if (!visualizaramMensagem.contains(this)) {
					visualizaramMensagem.add(this);
				}
				System.out.println(mensagem.getRemetente().getNome() + ": " +mensagem.getConteudo());
			}
		}

		System.out.println();
	}

	public void cancelarMensagem(int idMensagem) {
		for (Comando cancelarMensagemComando : cancelarMensagemComandos)
			if (((CancelarMensagemComando)cancelarMensagemComando).getMensagem().getId() == idMensagem)
				cancelarMensagemComando.executar();
	}

}
