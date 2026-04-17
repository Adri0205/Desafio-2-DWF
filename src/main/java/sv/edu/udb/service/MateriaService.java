package sv.edu.udb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.udb.model.Materia;
import sv.edu.udb.repository.MateriaRepository;
import java.util.List;
import java.util.Optional;

@Service
public class MateriaService {

    @Autowired
    private MateriaRepository repository;

    public List<Materia> listar() {
        return repository.findAll();
    }

    public Materia buscarPorId(Long id) {
        Optional<Materia> materia = repository.findById(id);
        return materia.orElse(null);
    }

    public Materia guardar(Materia materia) {
        return repository.save(materia);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}

