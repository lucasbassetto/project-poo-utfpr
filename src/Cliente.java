public class Cliente extends Pessoa {

    private int id;

    public Cliente() {
    }

    public Cliente(String nome, String cpf, String endereco, String telefone, int id) {
        super(nome, cpf, endereco, telefone);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "\nDados do cliente inserido:\n" +
                "Nome: " + this.getNome() +
                "\nCPF: " + this.getCpf() +
                "\nEndereço: " + this.getEndereco() +
                "\nTelefone: " + this.getTelefone() +
                "\nID: " + this.id;
    }
}
