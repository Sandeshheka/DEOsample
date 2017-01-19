
package leaffrogproject.DAO;

import java.util.List;
import leaffrogproject.entity.Course;



public interface CourseDAO {
     boolean insert(Course s);
    List<Course> getAll();
    Course getById(int id);
    boolean delete(int id);
}
