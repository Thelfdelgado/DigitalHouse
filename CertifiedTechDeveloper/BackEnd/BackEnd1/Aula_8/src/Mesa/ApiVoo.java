package Mesa;

import java.util.List;

public class ApiVoo {
    private List<Voo> vooList;

    public ApiVoo(List<Voo> vooList){
        this.vooList = vooList;
    }

    public Voo buscarVoos(Voo voo){
        Voo voos = new Voo(voo.getDestino(), voo.getDataPartida(), voo.getDataRetorno());
        for (Voo v : this.vooList){
            if (v.getDestino().equals(voo) && v.getDataPartida().equals(voo) && v.getDataRetorno().equals(voo))
                voos = v;

        }

        return voos;
    }
}
