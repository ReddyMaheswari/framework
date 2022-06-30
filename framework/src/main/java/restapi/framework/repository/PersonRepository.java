package restapi.framework.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import restapi.framework.model.Person;

public interface PersonRepository extends JpaRepository<Person,Long>{

}
