package com.awrs.heroesapi.repository;
import com.awrs.heroesapi.document.Heroes;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
@EnableScan
public interface HeroesRepository extends CrudRepository<Heroes, String>{

}
