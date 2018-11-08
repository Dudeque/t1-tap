import java.util.ArrayList;
import java.util.List;

public class GrupoFactory{

    private static int ultimoId = 0; // Guarda o último ID cadastrado + 1

    public static Grupo criarGrupo(String nome, String descricao, Usuario administrador)
    {  
        // Instanciação e criação do grupo
        Grupo grupo = new Grupo();
        grupo.setNome(nome);
        grupo.setDescricao(descricao);
        grupo.setAdministrador(administrador); 
        grupo.setMembros(new ArrayList<Observer>());
        grupo.setMensagens(new ArrayList<Mensagem>());        
        grupo.adicionarUsuario(administrador, (Observer) administrador); // Adiciona o administrador com membro do grupo
        administrador.getGrupos().add(grupo); // Adiciona o grupo à lista de grupos do administrador
        
        // Atribui o valor do atributo estático ultimoId para o ID do grupo recém criado        
        grupo.setId(GrupoFactory.ultimoId);

        // Incrementa o ID
        GrupoFactory.ultimoId++;

        return grupo;
    }
    
}