package com.example.Spring.Repository;

import com.example.Spring.entity.Coarse;
import com.example.Spring.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepositoryTest {
    @Autowired
    private TeacherRepository teacherRepository;

//    @Test
//    public void saveTeacher()
//    {
//        Coarse coarse1= Coarse.builder().credit(2).title("Science").build();
//        Coarse coarse2= Coarse.builder().credit(3).title("Hindi").build();
//        Teacher teacher= Teacher.builder().firstName("Akshita").lastName("gupta").coarses(List.of( coarse1,coarse2)).build();
//        teacherRepository.save(teacher);
//    }

}