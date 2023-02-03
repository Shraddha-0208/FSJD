package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class Bank_DAO {
	//used for autogeneration of a reference for an object
		@Autowired
		Bank_Repo repo;
		
		
		public Bank Bankinsert(Bank b) {
			return repo.save(b);
		}	
				
}
