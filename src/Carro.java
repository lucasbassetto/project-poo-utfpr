// Lucas Feliciano Bassetto - RA: 1750658

public class Carro extends Veiculo implements Aluguel {

    private String numeroPortas;

    public Carro() {
    }

    public Carro(String placa, String marca, String modelo, String cor, boolean isDisponivel, String numeroPortas) {
        super(placa, marca, modelo, cor, isDisponivel);
        this.numeroPortas = numeroPortas;
    }

    public String getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(String numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    @Override
    public void alugar() {
        if(isDisponivel()) {
            setDisponivel(false);
            System.out.println();
            System.out.println("Carro alugado: " + getPlaca() + " - " + getMarca() + " - " + getModelo() + " - " + getCor());
        } else {
            System.out.println("Carro indisponível para aluguel: " + getPlaca() + " - " + getMarca() + " - " + getModelo() + " - " + getCor());
        }
    }

//    public void carrosDisponiveis(List<Carro> car) {
//        System.out.println("Carros disponíveis para alugar: ");
//        for (Carro carro : car) {
//            if (carro.isDisponivel()) {
//                System.out.println(carro);
//            }
//        }
//        System.out.println();
//    }
    @Override
    public String toString() {
        return  getPlaca() + " - " + getMarca() + " - " + getModelo() + " - " + getCor();
    }
}
