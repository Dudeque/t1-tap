/* javac -d . src/*.java */

public class Main {

    public static void main(String args[]) {    
        Usuario p1 = UsuarioFactory.criarUsuario("Tio Nestor", "489465465", "Dia 7 vote BRASIL!");
        Usuario p2 = UsuarioFactory.criarUsuario("Primo Josias", "913131313", "deus capacita os capacitados");
        Usuario p3 = UsuarioFactory.criarUsuario("Vó Benta", "913172419", "vai um bolo de laranja?");
        Usuario p4 = UsuarioFactory.criarUsuario("Adolescente bobo", "913172419", "ancapistão!! kk");

        Grupo g1 = GrupoFactory.criarGrupo("Família Buscapé!", "aqui tem informação", p1); // p1 cria g1
        Grupo g2 = GrupoFactory.criarGrupo("A Grande Família", "aqui também tem informação", p1); // p1 cria g2
        Grupo g3 = GrupoFactory.criarGrupo("Souzalândia", "aqui não tem informação falsa", p3); // p3 cria g3

        Usuario[] usuariosG1 = {p2, p3, p4}; 
        p1.adicionarUsuariosGrupo(usuariosG1, g1); // – p1 inclui p2, p3 e p4 no grupo g1;

        Usuario[] usuariosG2 = {p2, p3};
        p1.adicionarUsuariosGrupo(usuariosG2, g2); // – p1 inclui p2 e p3 no grupo g2;

        p3.adicionarUsuarioGrupo(p4, g3); // – p3 inclui p4 no grupo g3;

        // – p2 envia mensagem para g1; (todos visualizam)
        System.out.println("[Enviando mensagem de p2 para o g1...]");
        int idComandoCancelar1 = p2.enviarMensagemTexto(g1, "Alerta do Zap! João Willy está fazendo um filme sobre Jesus ser gay");
        p1.visualizarGrupo(g1); 
        p2.visualizarGrupo(g1);
        p3.visualizarGrupo(g1);
        p4.visualizarGrupo(g1);
        
        // – p1 envia mensagem para g1; (todos visualizam)
        System.out.println("[Enviando mensagem de p1 para o g1...]");
        int idComandoCancelar2 = p1.enviarMensagemTexto(g1, "Biboniro anuncia que vai fundir ministerio da Cultura com da Agronomia");
        p1.visualizarGrupo(g1);
        p2.visualizarGrupo(g1);
        p3.visualizarGrupo(g1);
        p4.visualizarGrupo(g1);
        
        // – p2 envia mensagem para g2; (p1, p2 e p4 visualizam)
        System.out.println("[Enviando mensagem de p2 para o g2...]");
        int idComandoCancelar3 = p2.enviarMensagemTexto(g2, "Juiz Mérgio Soro assume Ministério dos Vigilantes");
        p1.visualizarGrupo(g2);
        p2.visualizarGrupo(g2);
        p4.visualizarGrupo(g2);
        
        // – p3 envia mensagem para g3; 
        System.out.println("[Enviando mensagem de p3 para o g3...]");
        int idComandoCancelar4 = p3.enviarMensagemAudio(g3, "a_morte_de_um_heroi_preso_injustiçado.wav");
        
        // – p3 envia mensagem para g2; (p1 e p2 visualizam)
        System.out.println("[Enviando mensagem de p3 para o g2...]");
        int idComandoCancelar5 = p3.enviarMensagemAudio(g2, "a_morte_de_um_heroi_preso_injustiçado.wav");
        p1.visualizarGrupo(g2);
        p2.visualizarGrupo(g2);
        

        System.out.println("[Cancelando mensagem de p3 para o g3...]"); // – p3 cancela mensagem para g3)
        p3.cancelarMensagem(idComandoCancelar4);
        
        // – p3 envia mensagem para g3; (todos visualizam)
        System.out.println("[Enviando mensagem de p3 para o g3...]");
        int idComandoCancelar6 = p3.enviarMensagemTexto(g3, "Era fake news galera kkkkkk..... Não dá pra acreditar em nada mesmo hoje em dia");
        p1.visualizarGrupo(g3);
        p2.visualizarGrupo(g3);
        p3.visualizarGrupo(g3);
        p4.visualizarGrupo(g3);
   
    }
    
}