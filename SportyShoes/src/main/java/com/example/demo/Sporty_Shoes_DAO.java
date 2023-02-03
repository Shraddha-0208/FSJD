package com.example.demo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class Sporty_Shoes_DAO {
	//used for autogeneration of a reference for an object
		@Autowired
		Sporty_Shoes_Repo repo;
		
		public Sporty_Shoes Shoeinsert(Sporty_Shoes s) {
			return repo.save(s);
		}
		
		public List<Sporty_Shoes> getall(){
			return repo.findAll();
		}
		
	
		public String DeleteShoe(Sporty_Shoes s) {
			repo.delete(s);
		return "Deleted";
		}
	
		
		
		
		public Sporty_Shoes edit(Sporty_Shoes s) {
			Sporty_Shoes ss=repo.findById(s.getShoe_Id()).orElse(null);
			ss.setShoe_Brand((s.getShoe_Brand()));
			ss.setShoe_Price(ss.getShoe_Price());
			
		return	repo.save(ss);
			
		}
		
		
				
}
