package Aula;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Main {
    private static final String sqlCreate = "DROP TABLE IF EXISTS Conta;"
            + "CREATE TABLE Conta"
            + "(" + "id INT PRIMARY KEY,"
            + "nome VARCHAR(100) NOT NULL,"
            + "numConta VARCHAR(100) NOT NULL,"
            + "saldo NUMERIC (15,2)" + ");";

    private static final String sqlInsert = "INSERT INTO Conta(id, nome, numConta, saldo) VALUES (?,?,?,?);";

    private static final String sqlUpdate = "UPDATE Conta SET saldo = ? WHERE id = ?;";

    public static void main(String[] args) throws Exception {
        Conta conta = new Conta(1, "Luiz", "123abc123", 100);

        Connection c = null;

        try {
            c = ConnectionJDBC.getConnection();
            Statement s = c.createStatement();
            s.execute(sqlCreate);

            PreparedStatement psInsert = c.prepareStatement(sqlInsert);

            psInsert.setInt(1, conta.getId());
            psInsert.setString(2, conta.getNome());
            psInsert.setString(3, conta.getNumConta());
            psInsert.setDouble(4, conta.getSaldo());
            psInsert.execute();

            PreparedStatement psUpdate = c.prepareStatement(sqlUpdate);
            psUpdate.setDouble(1, conta.aumentarSaldo(10));
            psUpdate.setInt(2, conta.getId());
            psUpdate.execute();

            c.setAutoCommit(false);

            PreparedStatement psUpdate2 = c.prepareStatement(sqlUpdate);
            psUpdate2.setDouble(1, conta.aumentarSaldo(15));
            psUpdate2.setInt(2, conta.getId());
            psUpdate2.execute();

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
