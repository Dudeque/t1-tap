/* javac -d . src/*.java */

public class Main {

    public static void main(String args[]) {    
        Usuario p1 = UsuarioFactory.criarUsuario("Josias", "489465465", "Deus capacita os escolhidos!");
        Usuario p2 = UsuarioFactory.criarUsuario("Lulindo", "913131313", "Companheiro k k k!!!");
        Usuario p3 = UsuarioFactory.criarUsuario("Juiz Mérgio Soro", "913172419", "Eu vo mata o lulé<tico></tico>");
        Usuario p4 = UsuarioFactory.criarUsuario("Mair Jessias", "913172419", "Eu vo mata o lulé<tico></tico>");

        Grupo g1 = GrupoFactory.criarGrupo("Família Buscapé!", "aqui tem informação", p1);
        Grupo g2 = GrupoFactory.criarGrupo("A Grande Família", "aqui também tem informação", p1);
        Grupo g3 = GrupoFactory.criarGrupo("Souzalândia", "aqui não tem informação", p3);

        Usuario[] usuariosG1 = {p2, p3, p4};
        p1.adicionarUsuariosGrupo(usuariosG1, g1);

        Usuario[] usuariosG2 = {p2, p3};
        p1.adicionarUsuariosGrupo(usuariosG2, g2);

        p3.adicionarUsuarioGrupo(p4, g3);

        // – p2 envia mensagem para g1; (todos visualizam)
        System.out.println("[Enviando mensagem de p2 para o g1...]");
        int idMensagem1 = p2.enviarMensagemTexto(g1, "Alerta do Zap! João Willy está fazendo um filme sobre Jesus ser gay");
        p1.visualizarGrupo(g1);
        p2.visualizarGrupo(g1);
        p3.visualizarGrupo(g1);
        p4.visualizarGrupo(g1);
        
        // – p1 envia mensagem para g1; (todos visualizam)
        System.out.println("[Enviando mensagem de p1 para o g1...]");
        int idMensagem2 = p1.enviarMensagemTexto(g1, "Biboniro anuncia que vai fundir ministerio da Cultura com da Agronomia");
        p1.visualizarGrupo(g1);
        p2.visualizarGrupo(g1);
        p3.visualizarGrupo(g1);
        p4.visualizarGrupo(g1);
        
        System.out.println("[Enviando mensagem de p2 para o g2...]");
        int idMensagem3 = p2.enviarMensagemTexto(g2, "Juiz Mérgio Soro assume Ministério dos Vigilantes");
        p1.visualizarGrupo(g2);
        p2.visualizarGrupo(g2);
        p4.visualizarGrupo(g2);
        
        System.out.println("[Enviando mensagem de p3 para o g3...]");
        int idMensagem4 = p3.enviarMensagemAudio(g3, "a_morte_de_um_heroi_preso_injustiçado.wav");
        
        System.out.println("[Enviando mensagem de p3 para o g2...]");
        int idMensagem5 = p3.enviarMensagemAudio(g2, "a_morte_de_um_heroi_preso_injustiçado.wav");
        p1.visualizarGrupo(g2);
        p2.visualizarGrupo(g2);
        
        System.out.println("[Cancelando mensagem de p3 para o g3...]");
        p3.cancelarMensagem(idMensagem4);
        
        System.out.println("[Enviando mensagem de p3 para o g3...]");
        int idMensagem6 = p3.enviarMensagemTexto(g3, "Era fake news galera kkkkkk..... Não dá pra acreditar em nada mesmo hoje em dia");
        p1.visualizarGrupo(g3);
        p2.visualizarGrupo(g3);
        p3.visualizarGrupo(g3);
        p4.visualizarGrupo(g3);

       /* g1.getMembros().forEach(usuario -> System.out.println(((Usuario) usuario).getNome())); */       
    }
    
}