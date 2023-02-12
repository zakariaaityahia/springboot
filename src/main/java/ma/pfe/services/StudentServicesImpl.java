package ma.pfe.services;

import ma.pfe.dtos.StudentDto;
import ma.pfe.entities.StudentEntity;

import java.util.List;

public class StudentServicesImpl implements StudentServices{

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
    public List<StudentEntity> readAll() {
        return null;
    }
}
