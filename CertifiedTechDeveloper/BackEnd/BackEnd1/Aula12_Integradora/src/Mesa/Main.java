package Mesa;

import org.apache.log4j.Logger;
import org.h2.Driver;

import java.sql.*;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);

    // Criar tabela com 5 colunas - id, nome, sobrenome, cargo, idade;
    private static final String sqlCreateTable = "DROP TABLE IF EXISTS Funcionarios; CREATE TABLE Funcionarios" + "("
            + "id INT PRIMARY KEY,"
            + "nome VARCHAR(100) NOT NULL,"
            + "sobrenome VARCHAR(100) NOT NULL,"
            + "cargo VARCHAR(100) NOT NULL,"
            + "idade INT NOT NULL" + ")";

    private static final String sqlInsert1 = "INSERT INTO Funcionarios(id, nome, sobrenome, cargo, idade) VALUES (1, 'Luiz', 'Delgado', 'DevJunior', 24)";
    private static final String sqlInsert2 = "INSERT INTO Funcionarios(id, nome, sobrenome, cargo, idade) VALUES (2, 'Luiz1', 'Delgado1', 'DevPleno', 25)";
    private static final String sqlInsert3 = "INSERT INTO Funcionarios(id, nome, sobrenome, cargo, idade) VALUES (3, 'Luiz2', 'Delgado2', 'DevSenior', 26)";

    private static final String sqlUpdate = "UPDATE Funcionarios SET cargo = 'DevSenior' WHERE cargo = 'DevPleno'";
    private static final String sqlUpdateId = "UPDATE Funcionarios SET id = 3 WHERE nome = 'Luiz2'";
    private static final String sqlDeleteId = "DELETE FROM Funcionarios WHERE id=3";
    private static final String sqlDelete = "DELETE FROM Funcionarios WHERE nome='Luiz'";

    public static void main(String[] args) throws Exception {
        Connection c = null;

        try {
            c = getConnection();
            Statement s = c.createStatement();
            s.execute(sqlCreateTable);

            s.execute(sqlInsert1);
            s.execute(sqlInsert2);
            s.execute(sqlInsert3);
            logger.info("Usuarios com mesmo id");

            ShowFuncionarios(c);
            logger.info("Mostra os funcionarios");

            s.execute(sqlUpdate);
            s.execute(sqlUpdateId);
            logger.debug("Update debug");

            s.execute(sqlDelete);
            s.execute(sqlDeleteId);
            ShowFuncionarios(c);
            logger.info("Mostra os funionarios atualizados");
        }
        catch (Exception e){
            e.printStackTrace();
            logger.error("Ids repetidos.");
        }finally {
            if (c == null){
                return;
            }
            c.close();
        }
    }

    private static void ShowFuncionarios(Connection c) throws SQLException {
        String sqlQuery = "SELECT * FROM Funcionarios";
        Statement s = c.createStatement();
        ResultSet rs = s.executeQuery(sqlQuery);

        while (rs.next()){
            System.out.println(rs.getInt(1) + " - "
            + rs.getString(2) + " - "
            + rs.getString(3) + " - "
            + rs.getString(4) + " - "
            + rs.getInt(5));
        }
    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    }
}
