import java.util.ArrayList;
import java.util.List;

public class GrupoFactory{

    private static int ultimoId = 0;

    public static Grupo criarGrupo(String nome, String descricao, Usuario administrador)
    {   Grupo grupo = new Grupo();
        grupo.setNome(nome);
        grupo.setDescricao(descricao);
        grupo.setAdministrador(administrador);
        grupo.setMembros(new ArrayList<Observer>());

        grupo.adicionarUsuario(administrador, (Observer) administrador);
        administrador.getGrupos().add(grupo);
        
        grupo.setMensagens(new ArrayList<Mensagem>());
        
        grupo.setId(GrupoFactory.ultimoId);
        GrupoFactory.ultimoId++;

        return grupo;
    }
    
}