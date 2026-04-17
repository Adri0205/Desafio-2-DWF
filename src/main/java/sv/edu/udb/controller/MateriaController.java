package sv.edu.udb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sv.edu.udb.model.Materia;
import sv.edu.udb.service.MateriaService;

import java.util.List;

@RestController
@RequestMapping("/materias")
public class MateriaController {

    @Autowired
    private MateriaService service;

    @GetMapping
    public List<Materia> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Materia obtenerPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Materia guardar(@RequestBody Materia materia) {
        return service.guardar(materia);
    }

    @PutMapping("/{id}")
    public Materia actualizar(@PathVariable Long id, @RequestBody Materia materia) {
        materia.setId(id);
        return service.guardar(materia);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
