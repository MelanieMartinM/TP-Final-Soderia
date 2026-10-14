package tpSoderia.repository;

import tpSoderia.interfaces.IRepositorio;

import java.util.List;

public class RepositoryJSON<T> implements IRepositorio {





/// rutaArchivo: String
/// RepositorioJSON(rutaArchivo: String)
/// jsonAObjeto(json: JSONObject): T
/// objetoAJson(objeto: T): JSONObject
/// guardar(objeto: T): void
/// buscarPorId(id: String): T
/// obtenerTodos(): List<T>
/// actualizar(objeto: T): void
/// elim inar(id: String): void












    @Override
    public void guardar(Object elemento) {

    }

    @Override
    public T buscatXid(int id) {
        return null;
    }

    @Override
    public void eliminar(int id) {

    }

    @Override
    public void actualizar(int id) {

    }

    @Override
    public List<T> obtenerTodos() {
        return null;
    }
}
