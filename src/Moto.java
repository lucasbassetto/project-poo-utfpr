class Moto extends Veiculo implements Aluguel {

    private String cilindradas;

    public Moto() {
    }

    public Moto(String placa, String marca, String modelo, String cor, boolean isDisponivel, String cilindradas) {
        super(placa, marca, modelo, cor, isDisponivel);
        this.cilindradas = cilindradas;
    }

    public String getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public void alugar() {
        if (isDisponivel()) {
            setDisponivel(false);
            System.out.println("Moto alugada: " + getModelo() + " - " + getPlaca());
        } else {
            System.out.println("Moto indisponível para aluguel: " + getModelo() + " - " + getPlaca());
        }
    }
}
