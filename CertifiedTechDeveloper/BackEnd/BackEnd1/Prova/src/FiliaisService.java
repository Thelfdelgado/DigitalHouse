public class FiliaisService {
    private IDao<Filiais> filiaisIDao;

    public FiliaisService(IDao<Filiais> filiaisIDao) {
        this.filiaisIDao = filiaisIDao;
    }

    public Filiais salvar(Filiais filiais){
        return filiaisIDao.salvar(filiais);
    }
}
