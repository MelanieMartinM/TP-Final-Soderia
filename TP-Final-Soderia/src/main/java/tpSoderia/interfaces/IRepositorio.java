package tpSoderia.interfaces;

import java.util.List;

public interface IRepositorio <T>{

    //Crear paquete soderia.interfaces:
    // Interfaz genérica IRepositorio<T>
    // (guardar, buscarPorId, obtenerTodos,
    // actualizar, eliminar).


    void guardar(T elemento);

    T buscatXid(int id);

    void eliminar(int id);

    void actualizar(int id);

///  este tengo que verrrr
      List<T> obtenerTodos();

    




}
