package com.example.Spring.Repository;

import com.example.Spring.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    public List<Student> findByFirstName(String firstName);
    public List<Student> findByFirstNameContaining(String name);
    public List<Student> findByFirstNameAndLastName(String firstName,String lastName);
    //JPQL
    @Query("select s from Student s where s.emailId =?1")
    Student getStudentByEmailAddress(String emailId);

    @Query("select s.firstName from Student s where s.emailId =?1")
    String getStudentFirstNameByEmailAddress(String emailId);

    @Query(
            value = "select * from student_table s where s.email_address=?1",
            nativeQuery = true
    )
    Student getStudentByEmailAddressNative(String emailId);

    @Modifying
    @Transactional
    @Query(
            value = "update student_table  set first_name=?1 where email_address=?2",
            nativeQuery = true
    )
    int updateStudentNameByEmailId(String firstName,String emailId);
    @Modifying
    @Transactional
    @Query(
            value = "delete from student_table  where email_address=?1",
            nativeQuery = true
    )
    int deleteStudentNameByEmailId(String emailId);



}
