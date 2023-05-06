package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {

	// responsável por inserir esse objeto como parametro de entrada no banco de
	// dados
	void insert(Seller obj);

	void update(Seller obj);

	void deleteById(Seller id);

	// Retorna um Department pelo ID se existir caso não existir retrna nulo
	Seller findById(Integer id);

	// Retorna todos os departamentos em uma lista
	List<Seller> findAll();
	List<Seller> findByDepartment(Department department);
}
