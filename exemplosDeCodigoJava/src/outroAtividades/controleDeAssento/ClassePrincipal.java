package outroAtividades.controleDeAssento;

public class ClassePrincipal {
    public static void main(String[] args) {


        Cliente clientes[] = new Cliente[40];
        Cadeira cadeiras[] = new Cadeira[40];

        clientes[0] = new Cliente();
        clientes[1] = new Cliente();
        cadeiras[0] = new Cadeira(55,8);
        cadeiras[1] = new Cadeira(33,2);

        cadeiras[0].cancelaAssento();





    }


}

/*

        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();


        c1.cadastroClinete();
        c2.cadastroClinete();
        c1.consultaCliente();
        c2.consultaCliente();


 */