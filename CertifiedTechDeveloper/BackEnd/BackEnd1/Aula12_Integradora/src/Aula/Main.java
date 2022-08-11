package Aula;

import org.apache.log4j.Logger;

import java.sql.*;

public class Main {
    private static final String sqlCreateTable = "DROP TABLE IF EXISTS Usuario; CREATE TABLE Usuario" + "("
            + "id INT PRIMARY KEY,"
            + "primeiro_nome VARCHAR(100) NOT NULL,"
            + "sobrenome VARCHAR(100) NOT NULL,"
            + "idade INT NOT NULL" + ")";

    private static final String sqlInsert1 = "INSERT INTO Usuario(id, primeiro_nome, sobrenome, idade) VALUES (1, 'Luiz1', 'Delgado1', 24)";
    private static final String sqlInsert2 = "INSERT INTO Usuario(id, primeiro_nome, sobrenome, idade) VALUES (2, 'Luiz2', 'Delgado2', 25)";
    private static final String sqlInsert3 = "INSERT INTO Usuario(id, primeiro_nome, sobrenome, idade) VALUES (3, 'Luiz3', 'Delgado3', 26)";

    private static final String sqlDelete = "DELETE FROM Usuario WHERE idade = 25";

    private static final Logger l = Logger.getLogger(Main.class);

    public static void main(String[] args) throws Exception {
        Connection c = null;

        try {
            c = getConnection();
            Statement s = c.createStatement();
            s.execute(sqlCreateTable);

            s.execute(sqlInsert1);
            s.execute(sqlInsert2);
            s.execute(sqlInsert3);

            s.execute(sqlDelete);
            l.info("Excluido o usuario de idade igual a 25 anos");
            ShowUsuarios(c);

        }
        catch (Exception e){
            e.printStackTrace();
        }finally {
            if (c == null){
                return;
            }
            c.close();
        }
    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    }

    private static void ShowUsuarios(Connection c) throws SQLException {
        String sqlQuery = "SELECT * FROM Usuario";
        Statement s = c.createStatement();
        ResultSet rs = s.executeQuery(sqlQuery);

        while (rs.next()){
            System.out.println(rs.getInt(1) + " - "
            + rs.getString(2) + " - "
            + rs.getString(3) + " - "
            + rs.getInt(4));
        }
    }
}
