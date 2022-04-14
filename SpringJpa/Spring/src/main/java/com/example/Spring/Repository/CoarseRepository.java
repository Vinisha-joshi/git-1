package com.example.Spring.Repository;


import com.example.Spring.entity.Coarse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoarseRepository extends JpaRepository<Coarse,Long> {
}
