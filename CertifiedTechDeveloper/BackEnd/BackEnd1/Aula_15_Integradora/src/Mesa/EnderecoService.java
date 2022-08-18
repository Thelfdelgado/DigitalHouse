package Mesa;

public class EnderecoService {
    private IDao<Endereco> enderecoIDao;

    public EnderecoService(IDao<Endereco> enderecoIDao) {
        this.enderecoIDao = enderecoIDao;
    }

    public Endereco cadastro(Endereco endereco){
        return enderecoIDao.cadastro(endereco);
    }

    public Endereco buscar(Integer id) {
        return enderecoIDao.buscar(id);
    }

    public Endereco excluir(Integer id) {
        return enderecoIDao.excluir(id);
    }
}