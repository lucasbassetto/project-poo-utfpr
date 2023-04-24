// Lucas Feliciano Bassetto - RA: 1750658

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Carro> listaCarro = new ArrayList<>();
        List<Moto> listaMoto = new ArrayList<>();

        //Instanciação do cliente
        Cliente c = new Cliente();

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
        c4.setCor("Vermelho");
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

        //Adicionando os objetos na lista de carros
        listaCarro.add(c1);
        listaCarro.add(c2);
        listaCarro.add(c3);
        listaCarro.add(c4);
        listaCarro.add(c5);
        listaCarro.add(c6);
        listaCarro.add(c7);

        //Atribuindo valores aos objetos
        m1.setPlaca("BRA1234");
        m1.setMarca("Honda");
        m1.setModelo("CG");
        m1.setCor("Vermelho");
        m1.setDisponivel(true);
        m1.setCilindradas("160");

        //Atribuindo valores aos objetos
        m2.setPlaca("CCR2211");
        m2.setMarca("Honda");
        m2.setModelo("CG");
        m2.setCor("Preto");
        m2.setDisponivel(true);
        m2.setCilindradas("160");

        //Atribuindo valores aos objetos
        m3.setPlaca("SAS3333");
        m3.setMarca("Honda");
        m3.setModelo("CG");
        m3.setCor("Vermelho");
        m3.setDisponivel(false);
        m3.setCilindradas("160");

        //Atribuindo valores aos objetos
        m4.setPlaca("LKK4232");
        m4.setMarca("Suzuki");
        m4.setModelo("GZX");
        m4.setCor("Preto");
        m4.setDisponivel(false);
        m4.setCilindradas("1000");

        //Atribuindo valores aos objetos
        m5.setPlaca("LLL9990");
        m5.setMarca("Suzuki");
        m5.setModelo("Hayabusa");
        m5.setCor("Preto");
        m5.setDisponivel(true);
        m5.setCilindradas("1000");

        //Atribuindo valores aos objetos
        m6.setPlaca("KKJ1892");
        m6.setMarca("Harley-Davidson");
        m6.setModelo("XL");
        m6.setCor("Preto");
        m6.setDisponivel(true);
        m6.setCilindradas("883");

        //Atribuindo valores aos objetos
        m7.setPlaca("NBH-9891");
        m7.setMarca("Harley-Davidson");
        m7.setModelo("XR");
        m7.setCor("Preto");
        m7.setDisponivel(false);
        m7.setCilindradas("1200");

        //Adicionando os objetos na lista de motos
        listaMoto.add(m1);
        listaMoto.add(m2);
        listaMoto.add(m3);
        listaMoto.add(m4);
        listaMoto.add(m5);
        listaMoto.add(m6);
        listaMoto.add(m7);

        //Entrada de dados do usuário - Repare também que estou adicionando uma exceção para que o usuário digite um CPF válido (necessário 11 digitos)
        try {
            System.out.println("\n------------ INSIRA OS DADOS DO CLIENTE ----------");
            System.out.print("Digite o nome: ");
            String nome = sc.nextLine();
            c.setNome(nome);
            System.out.print("Digite o CPF: ");
            String cpf = sc.nextLine();
            c.setCpf(cpf);
            System.out.print("Digite o endereço: ");
            String endereco = sc.nextLine();
            c.setEndereco(endereco);
            System.out.print("Digite o telefone: ");
            String telefone = sc.nextLine();
            c.setTelefone(telefone);
            System.out.print("Digite o ID: ");
            int id = sc.nextInt();
            c.setId(id);

            //Mostrando no console os dados do cliente digitado
            System.out.println(c);

            //Mostrando no console os carros disponíveis no console. Repare que aparecerão apenas os carros disponíveis, onde isDisponivel = true
            System.out.println("\n===============================");
            System.out.println("Carros disponíveis para alugar: ");
            System.out.println("===============================");
            for (Carro carro : listaCarro) {
                if (carro.isDisponivel()) {
                    System.out.println(carro);
                }
            }
            System.out.println();

            //Tentando alugar alguns carros já alugados - aqui mostrará no console que os carros não estão disponíveis
            c5.alugar();
            c6.alugar();

            //Alugando um carro disponível - aqui mostrará no console que o carro foi alugado com sucesso
            c1.alugar();

            //Aqui mostrará no console os carros disponíveis atualizados. Repare que o c1 não aparece mais no console, haja vista que ele foi alugado pelo cliente.
            System.out.println("\n===============================");
            System.out.println("Carros disponíveis atualizadas: ");
            System.out.println("===============================");
            for (Carro carro : listaCarro) {
                if (carro.isDisponivel()) {
                    System.out.println(carro);
                }
            }

            //Agora, o cliente irá alugar uma moto
            //Mostrando no console as motos disponíveis no console. Repare que aparecerão apenas os carros disponíveis, onde isDisponivel = true
            System.out.println("\n===============================");
            System.out.println("Motos disponíveis para alugar: ");
            System.out.println("===============================");
            for (Moto moto  : listaMoto) {
                if (moto.isDisponivel()) {
                    System.out.println(moto);
                }
            }
            System.out.println();

            //Tentando alugar motos indisponíveis
            m3.alugar();
            m4.alugar();

            //Alugando uma moto disponível no sistema
            m2.alugar();

            //Aqui mostrará no console os motos disponíveis atualizadas. Repare que o m2 não aparece mais no console, haja vista que ele foi alugado pelo cliente.
            System.out.println("\n===============================");
            System.out.println("Motos disponíveis atualizadas: ");
            System.out.println("===============================");
            for (Moto moto  : listaMoto) {
                if (moto.isDisponivel()) {
                    System.out.println(moto);
                }
            }
            System.out.println();

        } catch (CpfTamanhoInvalido e) {
            System.out.println("ERRO: " + e.getMessage());
        }
    }
}