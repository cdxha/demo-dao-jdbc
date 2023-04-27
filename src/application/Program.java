package application;

import model.entities.Department;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Computers");
		System.out.println(obj);
		
		Department obj1;
		obj1 = new Department();
		System.out.println(obj1);
	}

}
