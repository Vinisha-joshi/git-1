package com.example.Spring.Repository;

import com.example.Spring.Alien;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


@Repository
public interface AlienRepository extends JpaRepository<Alien, Integer> {

   List<Alien> findByLang(String Lang);
   Alien findByAid(int aid);
   List<Alien> findByAidGreaterThan(int aid);

//   @Query("from alien where lang=?1 order by aname");
//   List<Alien> findByLangSorted(String lang);

}
