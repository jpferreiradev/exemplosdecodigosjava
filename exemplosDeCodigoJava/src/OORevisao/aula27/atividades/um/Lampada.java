package OORevisao.aula27.atividades.um;

public class Lampada {

    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    int gararantiaMeses;
    boolean tipoAbajur;
    boolean ligarLampada = true;
    boolean desligarLampada = false;

    boolean ligarLampada() {

        System.out.println("Lampâda ligada!");
        return ligarLampada;

    }

    boolean desligarLampada() {
        System.out.println("Lampada desligada!");

        return desligarLampada;
    }
}

// O que a professora colocou:
/*
atributo
boolean ligada;

void ligar(){
    ligada = true;
}

void desligadar(){
    ligada = false;
}

void mostrarEstado(){
    if(ligada){
            System.out.println("Lampada ligada!");

    } else {
            System.out.println("Lampada desligada!");
}
    }

void mudarEstado(){
    if(ligada){
    desligar();
} else {
ligar();
}

}


 */