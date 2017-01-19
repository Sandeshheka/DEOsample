


package leaffrogproject.DAO;

import java.util.List;
import leaffrogproject.entity.Students;




public interface StudentsDAO {
    boolean insert(Students s);
    List<Students> getAll();
    Students getById(int id);
    boolean delete(int id);
    
    
}
