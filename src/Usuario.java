public class Usuario implements Observer {

    private String nome;
    private String numero;
    private String status;
    private String foto;

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

	public void update(Grupo grupo)
	{
		System.out.println(this.nome + " recebeu mensagem no grupo " + grupo.getNome());
	}

}
