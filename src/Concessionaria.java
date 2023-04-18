//import java.util.ArrayList;
//import java.util.List;
//public class Concessionaria {
//
//    private List<Cliente> clientes = new ArrayList<>();
//    private List<Veiculo> veiculos = new ArrayList<>();
//
//    public List<Cliente> getClientes() {
//        return clientes;
//    }
//
//    public List<Veiculo> getVeiculos() {
//        return veiculos;
//    }
//
//    public void cadastrarCliente(Cliente cliente) {
//        clientes.add(cliente);
//        System.out.println("Cliente cadastrado com sucesso");
//    }
//
//    public void cadastrarVeiculo(Veiculo veiculo) {
//        veiculos.add(veiculo);
//        System.out.println("Veiculo cadastrado com sucesso");
//    }
//
//    public Cliente buscarCliente(String cpf) {
//        for (Cliente cliente : clientes) {
//            if (cliente.getCpf().equals(cpf)) {
//                return cliente;
//            }
//        }
//        return null;
//    }
//
//}
