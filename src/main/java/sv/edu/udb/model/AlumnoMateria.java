package sv.edu.udb.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "alumno_materia")
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(AlumnoMateria.class)
public class AlumnoMateria {

    @Id
    @ManyToOne
    @JoinColumn(name = "id_alumno")
    private Alumno alumno;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_materia")
    private Materia materia;
}
