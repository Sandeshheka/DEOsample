package leaffrogproject.DAO.impl;

import java.util.ArrayList;
import java.util.List;
import leaffrogproject.DAO.StudentsDAO;
import leaffrogproject.entity.Students;

public class StudentsDAOImpl implements StudentsDAO {

    private static List<Students> stdlist = new ArrayList<>();

    @Override
    public boolean insert(Students s) {
        stdlist.add(s);
        return true;
    }

    @Override
    public List<Students> getAll() {
        return stdlist;
    }

    @Override
    public Students getById(int id) {
        for (Students em : getAll()) {
            if (id == em.getStdID()) {
                return em;

            }

        }
        return null;
    }

    @Override
    public boolean delete(int id) {
        for (Students em : stdlist) {
            if (id == em.getStdID()) {
                stdlist.remove(em);
                return true;
            }

        }
        return false;
    }
}
