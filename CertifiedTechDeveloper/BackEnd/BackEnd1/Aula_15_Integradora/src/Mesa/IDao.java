package Mesa;

public interface IDao <T>{
    T cadastro(T t);
    T buscar(Integer id);
    T excluir(Integer id);
}
