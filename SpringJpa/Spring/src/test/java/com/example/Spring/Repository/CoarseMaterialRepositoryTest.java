package com.example.Spring.Repository;

import com.example.Spring.entity.Coarse;
import com.example.Spring.entity.CoarseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CoarseMaterialRepositoryTest {
    @Autowired
    private CoarseMaterialRepository repository;

    @Test
    public void SaveCoarseMaterial(){
        Coarse coarse=Coarse.builder().title("DSA").credit(6).build();
        CoarseMaterial coarseMaterial=CoarseMaterial.builder().url("www.google.com").coarse(coarse).build();
        repository.save(coarseMaterial);
    }
    @Test
    public void printAllCoarse()
    {
        List<CoarseMaterial>coarseMaterials=repository.findAll();
        System.out.println(coarseMaterials);
    }
}