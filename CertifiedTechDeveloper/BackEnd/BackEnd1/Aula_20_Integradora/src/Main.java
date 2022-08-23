import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Empresa empresa = new Empresa("1231231231230001", "Empresa");
        Funcionario f1 = new Funcionario("Luiz", "Delgado", "1234567", 6000);
        Funcionario f2 = new Funcionario("Luiz2", "Delgado2", "123123", 4000);
        Funcionario f3 = new Funcionario("Luiz3", "Delgado3", "321321",5000);
        Funcionario f4 = new Funcionario("Luiz4", "Delgado4", "1414242",7000);

        empresa.addFuncionario(f1);
        empresa.addFuncionario(f2);
        empresa.addFuncionario(f3);
        empresa.addFuncionario(f4);

        FileOutputStream fo = null;
        try {
            fo = new FileOutputStream("OutputFile.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fo);
            objectOutputStream.writeObject(empresa.funcionarios);
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }catch (IOException e){
            throw new RuntimeException(e);
        }

        List<Funcionario> funcionarios1 = null;
        FileInputStream fi = null;
        try {
            fi = new FileInputStream("OutputFile.txt");
            ObjectInputStream ois = new ObjectInputStream(fi);
            funcionarios1 = (ArrayList) ois.readObject();
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }catch (IOException e){
            throw new RuntimeException(e);
        }catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }

        for (Funcionario funcionario : funcionarios1){
            System.out.println(funcionario.getNome()+" : "+funcionario.getSobrenome()+" : "+funcionario.getDocumento()+" : "+funcionario.getSalario());
        }

        FileReader fi1 = new FileReader("empregados.txt");
        BufferedReader bi = new BufferedReader(fi1);
        try {
            String linha = bi.readLine();

            while (linha != null) {
                System.out.printf("%s\n", linha);
                linha = bi.readLine();
            }

            bi.close();
            fi1.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
