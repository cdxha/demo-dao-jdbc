package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {

	// responsável por inserir esse objeto como parametro de entrada no banco de
	// dados
	void insert(Department obj);

	void update(Department obj);

	void deleteById(Integer id);

	// Retorna um Department pelo ID se existir caso não existir retrna nulo
	Department findById(Integer id);

	// Retorna todos os departamentos em uma lista
	List<Department> findAll();

}
