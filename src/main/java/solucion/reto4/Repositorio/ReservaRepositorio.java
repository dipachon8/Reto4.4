package solucion.reto4.Repositorio;


import solucion.reto4.Modelo.Reserva;
import solucion.reto4.Repositorio.CRUD.ReservaCRUDRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ReservaRepositorio
{
    @Autowired
    private ReservaCRUDRepositorio reservaCRUDRepositorio;

    public List<Reserva> GetAll(){return (List<Reserva>) reservaCRUDRepositorio.findAll();}

    public Optional<Reserva> getReserva(int id) {return reservaCRUDRepositorio.findById(id);}

    public Reserva save(Reserva r) {return reservaCRUDRepositorio.save(r);}

    public void delete(Reserva r) {reservaCRUDRepositorio.delete(r);}
}
