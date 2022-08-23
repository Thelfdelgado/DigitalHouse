package Aula;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cachorro> cachorros = new ArrayList<>();

        Cachorro c1 = new Cachorro(2, "Maia");
        Cachorro c2 = new Cachorro(3,"Esquilo");

        cachorros.add(c1);
        cachorros.add(c2);

        FileOutputStream fo = null;
        try {
            fo = new FileOutputStream("OutputFile.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fo);
            objectOutputStream.writeObject(cachorros);
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }catch (IOException e){
            throw new RuntimeException(e);
        }

        List<Cachorro> cs2 = null;
        FileInputStream fi = null;

        try {
            fi = new FileInputStream("OutputFile.txt");
            ObjectInputStream ois = new ObjectInputStream(fi);

            cs2 = (ArrayList) ois.readObject();
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }catch (IOException e){
            throw new RuntimeException(e);
        }catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }

        for (Cachorro cachorro:cs2){
            System.out.println(cachorro.getNome()+" : "+cachorro.getIdade());
        }
    }
}
