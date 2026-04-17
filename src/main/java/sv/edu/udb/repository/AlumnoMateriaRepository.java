package sv.edu.udb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.edu.udb.model.AlumnoMateria;

public interface AlumnoMateriaRepository extends JpaRepository<Alumno, Long> {
}
