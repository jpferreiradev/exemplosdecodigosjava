package OORevisao.aula33.SobrecargaMetodosConstrutores.atividades.questao01;

public class TestaLampada {
    public static void main(String[] args) {

        //Lampada lampada =  new Lampada("A60","Bivolt",7,"Amarela","Amarelo",36,true);
        //Lampada lampadaDois = new Lampada("A50","Bivolt",7,"Branca","Vermelha",24,false);
        Lampada lampada = new Lampada();

        lampada.ligar();
        lampada.estadoLampada();
        lampada.desligar();
        lampada.estadoLampada();






    }

}
