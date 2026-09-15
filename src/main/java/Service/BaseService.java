/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * classe base generica da camada de servico.
 * concentra metodos basicos de crud e delega para o repository.
 * todas as classes de servico concretas devem estender essa classe.
 * 
 * @author gsantiagommv
 */
import Model.BaseModel;
import Repository.BaseRepository;
import java.util.List;

public abstract class BaseService<T extends BaseModel> {

    protected BaseRepository<T> repository;

    public BaseService(BaseRepository<T> repository) {
        this.repository = repository;
    }

    public T salvar(T entity) {
        // TODO: adicionar validacoes aqui no futuro
        return repository.save(entity);
    }

    public T buscarPorId(Long id) {
        return repository.findById(id);
    }

    public List<T> listarTodos() {
        return repository.findAll();
    }

    public void excluir(Long id) {
        repository.delete(id);
    }

    public T atualizar(T entity) {
        return repository.update(entity);
    }
}
