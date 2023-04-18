import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

//
//        //Instancação de objetos "Carro"
//        Carro c1 = new Carro("ABC1234", "FIAT", "Argo", "Prata", true, "4");
//        Carro c2 = new Carro("NBZ2131", "FIAT", "Pulse", "Preto", true, "4");
//        Carro c3 = new Carro("KIK1982", "FIAT", "Siena", "Azul", true, "4");
//        Carro c4 = new Carro("AKI8872", "FERRARI", "F8", "Vermelha", true, "2");
//        Carro c5 = new Carro("AZZ2162", "FERRARI", "F8", "Vermelha", false, "2");
//        Carro c6 = new Carro("LOL2288", "AUDI", "R8","Preto", false,"2");
//        Carro c7 = new Carro("IJH2121", "AUDI", "R8","Azul", true, "2");
//
//        //Instanciação dos objetos "Moto"
//
//        //Entrada de dados do usuário
//        System.out.println("------------ INSIRA OS DADOS DO CLIENTE ----------");
//        System.out.print("Digite o nome: ");
//        String nome = sc.nextLine();
//        System.out.print("Digite o CPF: ");
//        String cpf = sc.nextLine();
//        System.out.print("Digite o endereço: ");
//        String endereco = sc.nextLine();
//        System.out.print("Digite o telefone: ");
//        String telefone = sc.nextLine();
//        System.out.print("Digite o ID: ");
//        int id = sc.nextInt();
//        Cliente c = new Cliente(nome, cpf, endereco, telefone, id);
//        System.out.println(c);
//
        //Instancação de objetos "Carro"
        Carro c1 = new Carro();
        Carro c2 = new Carro();
        Carro c3 = new Carro();
        Carro c4 = new Carro();
        Carro c5 = new Carro();
        Carro c6 = new Carro();
        Carro c7 = new Carro();

        //Atribuindo valores aos objetos
        c1.setPlaca("ABC1234");
        c1.setMarca("FIAT");
        c1.setModelo("Pulse");
        c1.setCor("Prata");
        c1.setDisponivel(true);
        c1.setNumeroPortas("4");

        c2.setPlaca("NBZ2131");
        c2.setMarca("FIAT");
        c2.setModelo("Argo");
        c2.setCor("Preto");
        c2.setDisponivel(true);
        c2.setNumeroPortas("4");

        c3.setPlaca("KIK1982");
        c3.setMarca("FIAT");
        c3.setModelo("Siena");
        c3.setCor("Azul");
        c3.setDisponivel(true);
        c3.setNumeroPortas("4");

        c4.setPlaca("AKI8872");
        c4.setMarca("FERRARI");
        c4.setModelo("F8");
        c4.setCor("Vermelha");
        c4.setDisponivel(true);
        c4.setNumeroPortas("2");

        c5.setPlaca("AZZ2162");
        c5.setMarca("FIAT");
        c5.setModelo("Argo");
        c5.setCor("Prata");
        c5.setDisponivel(false);
        c5.setNumeroPortas("2");

        c6.setPlaca("AZZ2162");
        c6.setMarca("FIAT");
        c6.setModelo("Argo");
        c6.setCor("Prata");
        c6.setDisponivel(false);
        c6.setNumeroPortas("2");

        c7.setPlaca("AZZ2162");
        c7.setMarca("FIAT");
        c7.setModelo("Argo");
        c7.setCor("Prata");
        c7.setDisponivel(false);
        c7.setNumeroPortas("2");




    }
}