package com.cydeo.repository;

import com.cydeo.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

    //method --> sql ---> derived query
// BY ---> DELIMETER
    //findBy(int id) --> example  INTRODUCER (find, read, query, count, get) CRITERIA (after the first BY) can concatenate criteria with AND, OR
// conditions on entity properties
   // sql -- @Query

    //JPQL -- @Query

    //List<Student>findByFirstName(String firstName);
    //List<Student>findByEmail(String email);
    //List<Student>findDistinctByFirstName(String firstName);

    //multiple parameters
    //List<Student>findByFirstNameOrLastName(String firstName, String lastName);
    //List<Student>findByFirstNameAndEmail(String firstName, String email);

    //equality/Inequality Match

    //List<Student>findByFirstNameIs(String firstName);
    //List<Student>findByFirstNameIsNot(String firstName);
    //List<Student>findByFirstNameNot(String firstName);
    //List<Student>findByFirstNameEquals(String firstName);

    //boolean equality
    //List<Student>findByFirstNameTrue();
    //List<Student>findByFirstNameFalse();

    //Matching Conditions

    //List<Student>findByFirstNameStartingWith(String prefix); : StartWith, EndingWith, Containing

    //Comparison Condition
//List<Student> findByAgeLessThan(int age);
// List<Student> findByAgeLessThanEqual(int age);
//List<Student> findByAgeGreaterThan(int age);
//List<Student> findByAgeGreaterThanEqual(int age);
//List<Student> findByAgeBetween(int start, int end); between

    //Sorting

    //List<Student> findByFirstNameContainingOrderByFirstName(String firstName);
    //List<Student> findByFirstNameContainingOrderByFirstNameDesc(String firstName);

}
