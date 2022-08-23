package com.healthtrack.testConnection;

import com.healthtrack.db.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TesteConexaoAlimento {
    public static void main(String[] args) {
        try {

            //Abre uma conexão
            Connection conexao = ConnectionManager.getConnection();
            //insert
            PreparedStatement pstmt = conexao
                    .prepareStatement("INSERT INTO " +
                            "T_ALIMENTO(CD_ALIMENTO,DS_ALIMENTO,VL_QUILO,VL_GRAMA, DT_CONSUMO) " +
                            "VALUES (SEQ_ALIMENTO.NEXTVAL, ?, ?, ?, ?)");
            pstmt.setString(1, "Picanhaaaaaaaaaa");
            pstmt.setDouble(2, 2);
            pstmt.setDouble(3, 350);
            java.sql.Date data = new java.sql.Date(new java.util.Date().getTime());
            pstmt.setDate(4, data);
            pstmt.executeUpdate();

            pstmt.setString(1, "Carne");
            pstmt.setDouble(2, 2);
            pstmt.setDouble(3, 350);
            pstmt.executeUpdate();

            pstmt.setString(1, "Frango");
            pstmt.setDouble(2, 2);
            pstmt.setDouble(3, 350);
            pstmt.executeUpdate();

            pstmt.setString(1, "Peixe");
            pstmt.setDouble(2, 2);
            pstmt.setDouble(3, 350);
            pstmt.executeUpdate();

            pstmt.setString(1, "Alface");
            pstmt.setDouble(2, 0);
            pstmt.setDouble(3, 350);
            pstmt.executeUpdate();


            //Tratamento de erro
        } catch (SQLException e) {
            System.err.println("Não foi possível conectar no Banco de Dados");
            e.printStackTrace();
        }
    }
}

