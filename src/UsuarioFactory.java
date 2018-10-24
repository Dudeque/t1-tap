public class UsuarioFactory{

    public Usuario criarUsuario(String nome, String numero, String status)
    {   Usuario usuario = new Usuario();
        usuario.setNome(nome);
        usuario.setNumero(numero);
        usuario.setStatus(status);
        return usuario;
    }
    
}