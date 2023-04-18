class Moto extends Veiculo implements Aluguel {

    private int cilindradas;

    public Moto(String placa, String marca, String modelo, String cor, boolean isDisponivel, int cilindradas) {
        super(placa, marca, modelo, cor, isDisponivel);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
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
