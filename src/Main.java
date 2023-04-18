import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Carro> car = new ArrayList<>();

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
        //Instanciação de objetos "Carro"
        Carro c1 = new Carro();
        Carro c2 = new Carro();
        Carro c3 = new Carro();
        Carro c4 = new Carro();
        Carro c5 = new Carro();
        Carro c6 = new Carro();
        Carro c7 = new Carro();

        //Instancia de objetos "Moto"
        Moto m1 = new Moto();
        Moto m2 = new Moto();
        Moto m3 = new Moto();
        Moto m4 = new Moto();
        Moto m5 = new Moto();
        Moto m6 = new Moto();
        Moto m7 = new Moto();

        //Atribuindo valores aos objetos
        c1.setPlaca("ABC1234");
        c1.setMarca("FIAT");
        c1.setModelo("Pulse");
        c1.setCor("Prata");
        c1.setDisponivel(true);
        c1.setNumeroPortas("4");

        //Atribuindo valores aos objetos
        c2.setPlaca("NBZ2131");
        c2.setMarca("FIAT");
        c2.setModelo("Argo");
        c2.setCor("Preto");
        c2.setDisponivel(true);
        c2.setNumeroPortas("4");

        //Atribuindo valores aos objetos
        c3.setPlaca("KIK1982");
        c3.setMarca("FIAT");
        c3.setModelo("Siena");
        c3.setCor("Azul");
        c3.setDisponivel(true);
        c3.setNumeroPortas("4");

        //Atribuindo valores aos objetos
        c4.setPlaca("AKI8872");
        c4.setMarca("FERRARI");
        c4.setModelo("F8");
        c4.setCor("Vermelha");
        c4.setDisponivel(true);
        c4.setNumeroPortas("2");

        //Atribuindo valores aos objetos
        c5.setPlaca("AZZ2162");
        c5.setMarca("Ferrari");
        c5.setModelo("F8");
        c5.setCor("Amarelha");
        c5.setDisponivel(false);
        c5.setNumeroPortas("2");

        //Atribuindo valores aos objetos
        c6.setPlaca("IJH2121");
        c6.setMarca("Audi");
        c6.setModelo("R8");
        c6.setCor("Azul");
        c6.setDisponivel(false);
        c6.setNumeroPortas("2");

        //Atribuindo valores aos objetos
        c7.setPlaca("LOL2288");
        c7.setMarca("Audi");
        c7.setModelo("R8");
        c7.setCor("Preto");
        c7.setDisponivel(true);
        c7.setNumeroPortas("2");

        car.add(c1);
        car.add(c2);
        car.add(c3);
        car.add(c4);
        car.add(c5);
        car.add(c6);
        car.add(c7);

        m1.setPlaca("BRA1234");
        m1.setMarca("Honda");
        m1.setModelo("CG");
        m1.setCor("Vermelha");
        m1.setDisponivel(true);
        m1.setCilindradas("160");

        m2.setPlaca("CCR2211");
        m2.setMarca("Honda");
        m2.setModelo("CG");
        m2.setCor("Preto");
        m2.setDisponivel(true);
        m2.setCilindradas("160");

        m3.setPlaca("SAS3333");
        m3.setMarca("Honda");
        m3.setModelo("CG");
        m3.setCor("Vermelho");
        m3.setDisponivel(false);
        m3.setCilindradas("160");

        m4.setPlaca("LKK4232");
        m4.setMarca("Suzuki");
        m4.setModelo("GZX");
        m4.setCor("Preto");
        m4.setDisponivel(false);
        m4.setCilindradas("1000");

        m5.setPlaca("LLL9990");
        m5.setMarca("Suzuki");
        m5.setModelo("Hayabusa");
        m5.setCor("Preto");
        m5.setDisponivel(true);
        m5.setCilindradas("1000");

        m6.setPlaca("KKJ1892");
        m6.setMarca("Harley-Davidson");
        m6.setModelo("XL");
        m6.setCor("Preto");
        m6.setDisponivel(true);
        m6.setCilindradas("883");

        m7.setPlaca("NBH-9891");
        m7.setMarca("Harley-Davidson");
        m7.setModelo("XR");
        m7.setCor("Preto");
        m7.setDisponivel(false);
        m7.setCilindradas("1200");


        //Entrada de dados do usuário
        System.out.println("\n------------ INSIRA OS DADOS DO CLIENTE ----------");
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite o CPF: ");
        String cpf = sc.nextLine();
        System.out.print("Digite o endereço: ");
        String endereco = sc.nextLine();
        System.out.print("Digite o telefone: ");
        String telefone = sc.nextLine();
        System.out.print("Digite o ID: ");
        int id = sc.nextInt();
        Cliente c = new Cliente(nome, cpf, endereco, telefone, id);
        System.out.println(c);
        System.out.println();

        System.out.println("Carros disponíveis para alugar: ");
        for(Carro carro : car) {
            if(carro.isDisponivel()) {
                System.out.println(carro);
            }
        }
        System.out.println();

        //Tentando alugar um carro já alugado
        c5.alugar();

        //Alugando um carro disponível
        c1.alugar();

        System.out.println();
        System.out.println("Carros disponíveis atualizados: ");
        for(Carro carro : car) {
            if(carro.isDisponivel()) {
                System.out.println(carro);
            }
        }


    }
}