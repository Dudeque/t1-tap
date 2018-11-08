import java.util.ArrayList;
import java.util.List;	

public class Usuario implements Observer {

	private int id;

    private String nome;
    private String numero;
    private String status;
    private String foto;
    private List<Grupo> grupos;
    private List<Comando> cancelarMensagemComandos; // Lista com Comandos de cancelamento das mensagens enviadas por esse usuário

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

	// Notifica usuário que recebeu mensagem de grupo através do Observer
	public void update(Grupo grupo) 
	{
		System.out.println(this.nome + " recebeu mensagem no grupo " + grupo.getNome());
	}

	public void adicionarUsuarioGrupo(Usuario usuario, Grupo grupo)
	{
		grupo.adicionarUsuario(this, (Observer)usuario);
	} 

	// Este método chama o anterior várias vezes para adição em massa
	public void adicionarUsuariosGrupo(Usuario usuarios[], Grupo grupo)
	{
		for (Usuario usuario : usuarios)
			adicionarUsuarioGrupo(usuario, grupo);
	} 

	private int enviarMensagem(Mensagem mensagem) {
		// Cria os comandos de envio e cancelamento da mensagem criada, passada por parâmetro como "mensagem"
		Comando enviarMensagem = new EnviarMensagemComando(mensagem);
		Comando cancelarMensagem = new CancelarMensagemComando(mensagem);
		
		// Executa o envio da mensagem
		enviarMensagem.executar();

		// Adiciona o comando de cancelamento na lista do usuário
		this.cancelarMensagemComandos.add(cancelarMensagem);

		// Retorna o índice do comando de cancelamento na lista do usuário
		return cancelarMensagemComandos.indexOf(cancelarMensagem);
	}

	public int enviarMensagemTexto(Grupo grupo, String texto) {
		// Cria a mensagem desejada
		Mensagem mensagem = MensagemFactory.criarMensagemTexto(texto, this, grupo);

		// Faz o processo de envio da mensagem e retorna o índice do comando de cancelamento
		return enviarMensagem(mensagem);
	}

	public int enviarMensagemAudio(Grupo grupo, String tituloAudio) {
		// Cria a mensagem desejada
		Mensagem mensagem = MensagemFactory.criarMensagemAudio(tituloAudio, this, grupo);

		// Faz o processo de envio da mensagem e retorna o índice do comando de cancelamento
		return enviarMensagem(mensagem);
	}

	public int enviarMensagemVideo(Grupo grupo, String caminhoVideo) {
		// Cria a mensagem desejada
		Mensagem mensagem = MensagemFactory.criarMensagemVideo(caminhoVideo, this, grupo);


		// Faz o processo de envio da mensagem e retorna o índice do comando de cancelamento
		return enviarMensagem(mensagem);
	}

	public int enviarMensagemImagem(Grupo grupo, String caminhoImagem) {
		// Cria a mensagem desejada
		Mensagem mensagem = MensagemFactory.criarMensagemImagem(caminhoImagem, this, grupo);

		// Faz o processo de envio da mensagem e retorna o índice do comando de cancelamento
		return enviarMensagem(mensagem);
	}

	public void visualizarGrupo(Grupo grupo) {

		System.out.println("[Visão do " + this.getNome() + "]"); // Avisa qual usuário está visualizando o grupo 
		System.out.println("Mensagens do grupo " + grupo.getNome()); // Avisa qual grupo está sendo visualizado
		
		List<Mensagem> mensagensGrupo = grupo.getMensagens(); // Atribui a lista de mensagens ao grupo
		
		// Itera as mensagens do grupo
		for (Mensagem mensagem : mensagensGrupo) {
			// Pega lista de usuários que visualizaram
			List<Usuario> visualizaramMensagem = mensagem.getVisualizaram();
			if (mensagem.isCancelada()) {
				// Se cancelada, imprime apenas se o Usuário já visualizou
				if (visualizaramMensagem.contains(this)) {
					mensagem.imprimir();
				}
			} else {
				// Caso não cancelada, adiciona na lista dos que visualizaram e
				if (!visualizaramMensagem.contains(this)) {
					visualizaramMensagem.add(this);
				}
				mensagem.imprimir();
			}
		}

		System.out.println(); // Pula linha
	}


	// Método que cancela uma mensagem baseada no índice do comando de cancelamento
	public void cancelarMensagem(int indexComando) {
		// Pega o Comando na lista de Comandos do usuário, com índice indexComando e executa
		cancelarMensagemComandos.get(indexComando).executar();
	}

}
