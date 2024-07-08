package br.com.erudio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.erudio.model.Person;

public interface PersonRepository extends JpaRepository<Person,Long>{
	
}//define repositorio e passa a classe e o tipo do id
