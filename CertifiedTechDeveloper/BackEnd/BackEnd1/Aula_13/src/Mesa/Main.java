package Mesa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Main {
    private static final String sqlCreate = "DROP TABLE IF EXISTS Dentista;"
            + "CREATE TABLE Dentista"
            + "(" + "id INT PRIMARY KEY,"
            + "sobrenome VARCHAR(100) NOT NULL,"
            + "nome VARCHAR(100) NOT NULL,"
            + "matricula VARCHAR(255) NOT NULL" + ");";

    private static final String sqlInsert = "INSERT INTO Dentista(id,sobrenome,nome,matricula) VALUES (?,?,?,?);";

    private static final String sqlUpdate = "UPDATE Dentista SET matricula = ? WHERE id = ?;";

    public static void main(String[] args) throws Exception {
        Dentista dentista = new Dentista(1,"Delgado", "Luiz", "123abc456def");

        Connection c = null;

        try {
            c = ConnectionJDBC.getConnection();
            Statement s = c.createStatement();
            s.execute(sqlCreate);

            PreparedStatement psInsert = c.prepareStatement(sqlInsert);

            psInsert.setInt(1,dentista.getId());
            psInsert.setString(2,dentista.getSobrenome());
            psInsert.setString(3,dentista.getNome());
            psInsert.setString(4,dentista.getMatricula());
            psInsert.execute();

            PreparedStatement psUpdate = c.prepareStatement(sqlUpdate);
            psUpdate.setString(1,dentista.setMatricula("abc123def456"));
            psUpdate.setInt(2,dentista.getId());
            psUpdate.execute();

            c.commit();
            c.setAutoCommit(true);
        }catch (Exception e){
            e.printStackTrace();
            c.rollback();
        }finally {
            c.close();
        }
    }
}
