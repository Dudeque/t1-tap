import java.util.ArrayList;
import java.util.List;

public class UsuarioFactory{

    private static int ultimoId = 0;

    public static Usuario criarUsuario(String nome, String numero, String status)
    {   Usuario usuario = new Usuario();
        usuario.setNome(nome);
        usuario.setNumero(numero);
        usuario.setStatus(status);
        usuario.setGrupos(new ArrayList<Grupo>());
        usuario.setCancelarMensagemComandos(new ArrayList<Comando>());

        usuario.setId(UsuarioFactory.ultimoId);
        UsuarioFactory.ultimoId++;

        return usuario;
    }
    
}