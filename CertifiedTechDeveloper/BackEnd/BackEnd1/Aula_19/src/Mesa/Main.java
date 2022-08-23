package Mesa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Contato> contatos = new ArrayList<>();

        Contato c1 = new Contato("Luiz", "luiz@luiz.com", 123456789);
        Contato c2 = new Contato("Maju", "maju@maju.com", 987654321);

        FileOutputStream fo = null;
        try {
            fo = new FileOutputStream("ContatoOutputFile.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fo);
            objectOutputStream.writeObject(contatos);
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }catch (IOException e){
            throw new RuntimeException(e);
        }

        List<Contato> ctt2 = null;
        FileInputStream fi = null;
        try {
            fi = new FileInputStream("ContatoOutputFile.txt");
            ObjectInputStream ois = new ObjectInputStream(fi);
            ctt2 = (ArrayList) ois.readObject();
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }catch (IOException e){
            throw new RuntimeException(e);
        }catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }

        for (Contato contato:ctt2){
            System.out.println(contato.getNome() + " : " + contato.getEmail() + " : " + contato.getTelefone());
        }
    }
}
