package model.entities;

import java.io.Serializable;
import java.util.Objects;

//implements Serializable (Para os objetos serem transformados em sequencia de
// bytes) gravado em arquivo, trafegado em rede.
public class Department implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;

	// construtor sem atributos
	public Department() {
	}

	// construtor com atributos
	public Department(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	// fet and set para acessar o valores do objeto
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// para os objetos serem comparados pelo conteúdo e não pelo referencia de
	// ponteiros
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	// para os objetos serem comparados pelo conteúdo e não pelo referencia de
	// ponteiros
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(id, other.id);
	}

	// facilita imprimir os valores do objeto no momento que estiver testando
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
}