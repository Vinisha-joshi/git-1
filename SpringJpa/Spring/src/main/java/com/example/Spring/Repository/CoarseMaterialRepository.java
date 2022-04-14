package com.example.Spring.Repository;

import com.example.Spring.entity.CoarseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoarseMaterialRepository extends JpaRepository<CoarseMaterial,Long> {
}
