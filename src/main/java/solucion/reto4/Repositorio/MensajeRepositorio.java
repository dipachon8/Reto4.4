package solucion.reto4.Repositorio;

import solucion.reto4.Modelo.Mensaje;
import solucion.reto4.Repositorio.CRUD.MensajeCRUDRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MensajeRepositorio
{
    @Autowired
    private MensajeCRUDRepositorio mensajeCRUDRepositorio;

    public List<Mensaje> getAll(){return (List<Mensaje>) mensajeCRUDRepositorio.findAll();}

    public Optional<Mensaje> getMensaje(int id) {return mensajeCRUDRepositorio.findById(id);}

    public Mensaje save(Mensaje m) {return mensajeCRUDRepositorio.save(m);}

    public void delete(Mensaje m) {mensajeCRUDRepositorio.delete(m);}
}
