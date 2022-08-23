package com.healthtrack.dao;

import com.healthtrack.impl.AlimentoDAOImpl;

public abstract class DAOFactory {
    public static AlimentoDAO getAlimentoDAO() {
        return new AlimentoDAOImpl();
    }
}