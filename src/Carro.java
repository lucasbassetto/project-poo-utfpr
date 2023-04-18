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
            System.out.println("Carro alugado: " + getModelo() + " - " + getPlaca());
        } else {
            System.out.println("Carro indisponível para aluguel: " + getModelo() + " - " + getPlaca());
        }
    }
}
