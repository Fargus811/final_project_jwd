package by.sergeev.hotel.dao;

import by.sergeev.hotel.dao.impl.UserDaoImpl;

public class DaoFactory {

    private static DaoFactory instance;
    private static volatile Object localInstance = new Object();

    public static DaoFactory getInstance() {
        if (instance == null) {
            synchronized (localInstance) {
                if (instance == null) {
                    instance = new DaoFactory();
                }
            }
        }
        return instance;
    }

    public UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
