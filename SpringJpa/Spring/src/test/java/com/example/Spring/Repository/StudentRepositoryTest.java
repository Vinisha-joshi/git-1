package com.example.Spring.Repository;

import com.example.Spring.entity.Guardian;
import com.example.Spring.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent()
    {
        Student student= Student.builder().emailId("vinishajoshi2000@gmail.com")
                .firstName("vinisha").lastName("joshi").build();
        studentRepository.save(student);
    }
    @Test
    public void saveStudentWithGuardian()
    {
        Guardian guardian= Guardian.builder().name("vinisha").email("vinisha.com").mobile("8602").build();
        Student student= Student.builder().emailId("ashmeet2000@gmail.com")
                .firstName("ashmeet").lastName("joshi").guardian(guardian).build();
        studentRepository.save(student);

    }
    @Test
    public void printAllStudent()
    {
        List<Student> studentList=studentRepository.findAll();
        System.out.println(studentList);
    }
    @Test
    public void printStudentByFirstName()
    {
        List<Student>students=studentRepository.findByFirstNameContaining("sh");
        System.out.println(students);
    }
    @Test
    public void printStudentByEmailAddress()
    {
        Student students=studentRepository.getStudentByEmailAddress("vinishajoshi2000@gmail.com");
        System.out.println(students);
    }
    @Test
    public void printStudentFirstNameByEmailAddress()
    {
        String firstName=studentRepository.getStudentFirstNameByEmailAddress("vinishajoshi2000@gmail.com");
        System.out.println(firstName);
    }
    @Test
    public void printStudentByEmailAddressNative()
    {
        Student students=studentRepository.getStudentByEmailAddressNative("vinishajoshi2000@gmail.com");
        System.out.println(students);
    }
    @Test
    public void updateStudentNameByEmailIdTest()
    {
        studentRepository.updateStudentNameByEmailId("Vini","vinishajoshi2000@gmail.com");
    }
    @Test
    public void deleteStudentNameByEmailIdTest()
    {
        studentRepository.deleteStudentNameByEmailId("vinishajoshi2000@gmail.com");
    }

}