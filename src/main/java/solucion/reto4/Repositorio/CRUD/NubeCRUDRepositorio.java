package solucion.reto4.Repositorio.CRUD;


import solucion.reto4.Modelo.Nube;
import org.springframework.data.repository.CrudRepository;

//Interfaz encargada de recibir los datos de las entidades para realizar los servicios CRUD.
public interface NubeCRUDRepositorio extends CrudRepository<Nube,Integer>
{
}
