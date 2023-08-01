package OORevisao.aula43ClasseObjetc.Atividades.Questao03;

public class ClasseTeste {
    public static void main(String[] args) {

        Animal camelo = new Animal();
        camelo.setNome("Camelo");
        camelo.setComprimento(150);
        camelo.setCor("Amarelo");
        camelo.setAmbiente("Terra");
        camelo.setVelocidade(2);

        Peixe tubarao = new Peixe();
        tubarao.setNome("Tubarão");
        tubarao.setComprimento(300);
        tubarao.setVelocidade(1.5);

        Mamifero urso = new Mamifero();
        urso.setNome("Urso do canadá");
        urso.setComprimento(180);
        urso.setCor("Vermelho");
        urso.setVelocidade(0.5);

        Animal[] animais = new Animal[3];
        animais[0] = camelo;
        animais[1] = tubarao;
        animais[2] = urso;


        System.out.println("------------");
        for( Animal animal : animais){
            System.out.println(animal);
            System.out.println("--------------");
        }

    }
}




  /*
        Mamifero mamiferoUm = new Mamifero();
        mamiferoUm.setNome("Camelo");
        mamiferoUm.setComprimento(150);
        mamiferoUm.setPatas(4);
        mamiferoUm.setCor("Amarelo");
        //mamiferoUm.getAmbiente();
        mamiferoUm.setVelocidade(2.0);

        amifero mamiferoDois = new Mamifero("Mel");
        mamiferoDois.setNome("Urso-do-canadá");
        mamiferoDois.setComprimento(180);
        mamiferoDois.setPatas(4);
        mamiferoDois.setCor("Vermelho");
        mamiferoDois.setAmbiente("Terra");
        mamiferoDois.setVelocidade(0.5);
        mamiferoDois.setAlimento("Mel");



 */