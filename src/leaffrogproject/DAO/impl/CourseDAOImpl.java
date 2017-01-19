
package leaffrogproject.DAO.impl;

import java.util.ArrayList;
import java.util.List;
import leaffrogproject.DAO.CourseDAO;
import leaffrogproject.entity.Course;
import leaffrogproject.entity.Students;


public class CourseDAOImpl implements CourseDAO{
private static List<Course> courseslist = new ArrayList<>();

    @Override
    public boolean insert(Course s) {
         courseslist.add(s);
        return true;
    }

    @Override
    public List<Course> getAll() {
return courseslist;       
    }

    @Override
    public Course getById(int id) {
        for (Course em : getAll()) {
            if (id == em.getCourseId()) {
                return em;

            }

        }
        return null;
    }

    @Override
    public boolean delete(int id) {
         for (Course em : courseslist) {
            if (id == em.getCourseId()) {
                courseslist.remove(em);
                return true;
            }

        }
        return false;
    }
    
}
