package fit.iuh.controller;

import jakarta.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persistence.createEntityManagerFactory("ThiGK").createEntityManager();
	}

}
