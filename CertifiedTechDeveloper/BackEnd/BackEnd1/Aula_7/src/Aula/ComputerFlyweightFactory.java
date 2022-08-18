package Aula;

import java.util.HashMap;
import java.util.Map;

public class ComputerFlyweightFactory {
    private static Map<String, Computer> computerMap = new HashMap<>();

    public Computer getComputer(int ram, int hd){
        String id = "id: " + ram + " : " + hd;
        System.out.println(id);
        if (!computerMap.containsKey(id)){
            computerMap.put(id, new Computer(ram, hd));
            System.out.println("\nPC criado com sucesso");
            return computerMap.get(id);
        }
        System.out.println("\nPC obtido");
        return computerMap.get(id);
    }
}
