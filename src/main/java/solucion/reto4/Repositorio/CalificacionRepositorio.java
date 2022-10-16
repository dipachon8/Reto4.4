package solucion.reto4.Repositorio;


import solucion.reto4.Modelo.Calificacion;
import solucion.reto4.Repositorio.CRUD.CalificacionCRUDRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CalificacionRepositorio
{
    @Autowired
    private CalificacionCRUDRepositorio calificacionCRUDRepositorio;

    public List<Calificacion> GetAll(){return (List<Calificacion>) calificacionCRUDRepositorio.findAll();}

    public Optional<Calificacion> getCalificacion(int id) {return calificacionCRUDRepositorio.findById(id);}

    public Calificacion save(Calificacion c) {return calificacionCRUDRepositorio.save(c);}

    public void delete(Calificacion c) {calificacionCRUDRepositorio.delete(c);}
}
