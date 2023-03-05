package ma.pfe.repositories;

import javassist.bytecode.stackmap.TypeData;
import ma.pfe.entities.StudentEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepositoryImpl implements StudentRepository{

    private final static Logger LOG =  LoggerFactory.getLogger(StudentRepositoryImpl.class);

    @Override
    public Long create(StudentEntity e) {
        return null;
    }

    @Override
    public boolean update(StudentEntity e) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public List<StudentEntity> readAll() {
        return null;
    }


}
