package Mesa;

import java.sql.*;

import static java.sql.DriverManager.getConnection;

public class Main {
    private static final String sqlCreateTable = "DROP TABLE IF EXISTS Figuras; CREATE TABLE Figuras" + "("
    + "id INT PRIMARY KEY,"
    + "figura VARCHAR(100) NOT NULL,"
    + "cor VARCHAR(100) NOT NULL" + ")";

    private static final String sqlInsert1 = "INSERT INTO Figuras(id, figura, cor) VALUES (1, 'Circulo', 'Vermelho')";
    private static final String sqlInsert2 = "INSERT INTO Figuras(id, figura, cor) VALUES (2, 'Quadrado', 'Branco')";
    private static final String sqlInsert3 = "INSERT INTO Figuras(id, figura, cor) VALUES (3, 'Quadrado', 'Vermelho')";
    private static final String sqlInsert4 = "INSERT INTO Figuras(id, figura, cor) VALUES (4, 'Quadrado', 'Roxo')";
    private static final String sqlInsert5 = "INSERT INTO Figuras(id, figura, cor) VALUES (5, 'Circulo', 'Vermelho')";

    public static void main(String[] args) throws Exception {
        Connection c = null;

        try {
            c = getConnection();
            Statement s = c.createStatement();
            s.execute(sqlCreateTable);

            s.execute(sqlInsert1);
            s.execute(sqlInsert2);
            s.execute(sqlInsert3);
            s.execute(sqlInsert4);
            s.execute(sqlInsert5);

            ShowFiguras(c);
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

    private static void ShowFiguras(Connection c) throws SQLException {
        String sqlQuery = "SELECT * FROM Figuras WHERE figura = 'Circulo' AND cor = 'Vermelho'";
        Statement s = c.createStatement();
        ResultSet rs = s.executeQuery(sqlQuery);

        while (rs.next()){
            System.out.println(rs.getInt(1) + " - "
            + rs.getString(2) + " - "
            + rs.getString(3));
        }
    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    }
}
