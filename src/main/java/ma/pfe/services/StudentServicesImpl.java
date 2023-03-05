package ma.pfe.services;

import ma.pfe.dtos.StudentDto;
import ma.pfe.entities.StudentEntity;
import ma.pfe.repositories.StudentRepositoryImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServicesImpl implements StudentServices{

    private final static Logger LOG =  LoggerFactory.getLogger(StudentServicesImpl.class);

    @Override
    public Long create(StudentDto dto) {
        return null;
    }

    @Override
    public boolean update(StudentDto dto) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public List<StudentDto> readAll() {
        return null;
    }
}
