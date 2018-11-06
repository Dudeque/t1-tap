import java.util.ArrayList;
import java.util.List;

public class GrupoFactory{

    public static Grupo criarGrupo(String nome, String descricao, Usuario administrador)
    {   Grupo grupo = new Grupo();
        grupo.setNome(nome);
        grupo.setDescricao(descricao);
        grupo.setAdministrador(administrador);
        grupo.setMembros(new ArrayList<Observer>());

        grupo.adicionarUsuario(administrador, (Observer) administrador);
        administrador.getGrupos().add(grupo);

        grupo.setMensagens(new ArrayList<Mensagem>());
        return grupo;
    }
    
}