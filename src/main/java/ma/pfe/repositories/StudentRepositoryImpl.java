package ma.pfe.repositories;

import ma.pfe.entities.StudentEntity;

import java.util.List;

public class StudentRepositoryImpl implements StudentRepository{
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
