package sv.edu.udb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.udb.model.Alumno;
import sv.edu.udb.repository.AlumnoRepository;
import java.util.List;

@Service
public class AlumnoService {

    @Autowired
    private AlumnoRepository repository;

    public List<Alumno> listar() {
        return repository.findAll();
    }

    public Alumno guardar(Alumno alumno) {
        return repository.save(alumno);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}