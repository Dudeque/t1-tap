import java.util.ArrayList;
import java.util.List;

public class UsuarioFactory{

    private static int ultimoId = 0; // Guarda o último ID cadastrado + 1

    public static Usuario criarUsuario(String nome, String numero, String status)
    {   
        //Instanciação e criação do usuário
        Usuario usuario = new Usuario(); 
        usuario.setNome(nome);
        usuario.setNumero(numero);
        usuario.setStatus(status);
        usuario.setGrupos(new ArrayList<Grupo>());
        usuario.setCancelarMensagemComandos(new ArrayList<Comando>());

        // Atribui o valor do atributo estático ultimoId para o ID do usuário recém criado
        usuario.setId(UsuarioFactory.ultimoId);

        // Incrementa o ID
        UsuarioFactory.ultimoId++;

        return usuario;
    }
    
}