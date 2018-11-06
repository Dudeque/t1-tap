/* javac -d . src/*.java */

public class Main {

    public static void main(String args[]) {    
       Usuario p1 = UsuarioFactory.criarUsuario("Josias", "489465465", "Deus capacita os escolhidos!");
       Usuario p2 = UsuarioFactory.criarUsuario("Lulindo", "913131313", "Companheiro k k k!!!");
       Usuario p3 = UsuarioFactory.criarUsuario("Juiz Mérgio Soro", "913172419", "Eu vo mata o lulé<tico></tico>");
       Usuario p4 = UsuarioFactory.criarUsuario("Mair Jessias", "913172419", "Eu vo mata o lulé<tico></tico>");

       Grupo g1 = GrupoFactory.criarGrupo("Fake news", "aqui tem informação", p1);
       Grupo g2 = GrupoFactory.criarGrupo("Fake news 2", "aqui também tem informação", p1);
       Grupo g3 = GrupoFactory.criarGrupo("Fake news 3", "aqui não tem informação", p3);

       Usuario[] usuariosG1 = {p2, p3, p4};
       p1.adicionarUsuariosGrupo(usuariosG1, g1);

       Usuario[] usuariosG2 = {p2, p3};
       p1.adicionarUsuariosGrupo(usuariosG2, g2);

       p3.adicionarUsuarioGrupo(p4, g3);


       /* g1.getMembros().forEach(usuario -> System.out.println(((Usuario) usuario).getNome())); */       
    }
    
}