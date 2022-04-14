package com.example.Spring.Repository;

import com.example.Spring.entity.Coarse;
import com.example.Spring.entity.CoarseMaterial;
import com.example.Spring.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CoarseRepositoryTest {
    @Autowired
    private CoarseRepository repository;
    @Autowired
    CoarseMaterialRepository coarseMaterialRepository;

    @Test
    public void findAllCoarse() {
     /*   Coarse coarse = Coarse.builder().credit(10).title("Maths").build();
        CoarseMaterial courseMaterial = CoarseMaterial.builder().coarse(coarse).url("www.com").build();
        CoarseMaterial save = coarseMaterialRepository.save(courseMaterial);
        System.out.println(save
        );*/
        List<CoarseMaterial> coarseMaterialRepositoryAll = coarseMaterialRepository.findAll();
        List<Coarse> all = repository.findAll();
        //  System.out.println("CouseMaterial   " + coarseMaterialRepositoryAll);
        System.out.println("all " + all);
    }
    @Test
    public void saveCoarseWithTeacher()
    {
        Teacher teacher= Teacher.builder().firstName("Akshita").lastName("gupta").build();
        Coarse coarse1= Coarse.builder().credit(2).title("Science").teacher(teacher).build();
        repository.save(coarse1);
    }
}