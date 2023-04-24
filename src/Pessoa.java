// Lucas Feliciano Bassetto - RA: 1750658

public abstract class Pessoa {

    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, String endereco, String telefone) throws CpfTamanhoInvalido {
        if (cpf.length() != 11) {
            throw new CpfTamanhoInvalido("CPF com tamanho inválido"); // Lança a exceção personalizada
        }
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws CpfTamanhoInvalido {
        // Verifique se o CPF possui 11 dígitos
        if (cpf.length() != 11) {
            throw new CpfTamanhoInvalido("CPF com tamanho inválido, por favor, reinicie o programa e digite um CPF válido"); // Lança a exceção personalizada
        } else {
            this.cpf = cpf;
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
