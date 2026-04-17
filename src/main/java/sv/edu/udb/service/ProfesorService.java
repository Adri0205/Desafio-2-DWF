package sv.edu.udb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.udb.model.Profesor;
import sv.edu.udb.repository.ProfesorRepository;
import java.util.List;
import java.util.Optional;

@Service
public class ProfesorService {

    @Autowired
    private ProfesorRepository repository;

    public List<Profesor> listar() {
        return repository.findAll();
    }

    public Profesor buscarPorId(Long id) {
        Optional<Profesor> profesor = repository.findById(id);
        return profesor.orElse(null);
    }

    public Profesor guardar(Profesor profesor) {
        return repository.save(profesor);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}

