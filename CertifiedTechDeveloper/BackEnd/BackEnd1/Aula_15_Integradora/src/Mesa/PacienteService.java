package Mesa;

public class PacienteService {
    private IDao<Paciente> pacienteIDao;

    public PacienteService(IDao<Paciente> pacienteIDao){
        this.pacienteIDao = pacienteIDao;
    }

    public Paciente cadastro(Paciente paciente){
        return pacienteIDao.cadastro(paciente);
    }

    public Paciente buscar(Integer id){
        return pacienteIDao.buscar(id);
    }

    public Paciente excluir(Integer id){
        return pacienteIDao.excluir(id);
    }
}
