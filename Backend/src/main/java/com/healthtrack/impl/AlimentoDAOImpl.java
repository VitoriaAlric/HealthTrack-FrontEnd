package com.healthtrack.impl;

import com.healthtrack.dao.AlimentoDAO;
import com.healthtrack.db.ConnectionManager;
import com.healthtrack.entity.Alimento;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlimentoDAOImpl implements AlimentoDAO {
    private Connection conexao;
    PreparedStatement pstm = null;

    public AlimentoDAOImpl() {

    }

    @Override
    public void insert(Alimento alimento) {
        try {
            conexao = ConnectionManager.getInstance().getConnection();

            pstm = conexao
                    .prepareStatement("INSERT INTO " +
                            "T_ALIMENTO(CD_ALIMENTO,DS_ALIMENTO,VL_QUILO,VL_GRAMA,DT_CONSUMO) " +
                            "VALUES (SEQ_ALIMENTO.NEXTVAL, ?, ?, ?, ?, ?)");
            pstm.setInt(1, alimento.getIdAlimento());
            pstm.setString(2, alimento.getDescricaoAlimento());
            pstm.setDouble(3, alimento.getValorQuilo());
            pstm.setDouble(4, alimento.getValorGrama());
            pstm.setDate(5, new Date(alimento.getDataConsumo().getTimeInMillis()));
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                pstm.close();
                conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
