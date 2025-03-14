package com.example.jpa2.repos;

import com.example.jpa2.entities.Employee;
import jakarta.transaction.Transactional;
import org.hibernate.annotations.Parameter;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

    @Query("select firstName,lastName from Employee where salary>(select AVG(salary) from Employee)")
    public List<Object[]> getAllEmployeeNamesBasedOnAgeAndSalary(Sort sort);

    //Update salary of all
    // employees by a salary passed as a parameter whose existing salary is less than the average salary.

    @Modifying
    @Query("update Employee set salary=:salary where salary<(select AVG(salary) from Employee)")
    public void updateSalaryByMinimum(@Param("salary") long salary);

//    @Modifying
//    @Query("delete from Employee where salary=(select MIN(salary) from Employee)")
//    public List<Employee> deleteEmployeeWithMinimumSalary();

    @Query("select MIN(salary) from Employee ")
    public long findAllWithMinSalary();

    @Modifying
    @Query("delete from Employee where salary=:minsalary")
    public int deleteEmployeeWithMinimumSalary(@Param("minsalary") long minsalary);



    //1) Display the id, first name, age of all employees where last name ends with "singh"
    @Query(value = "select EMP_ID,EMP_FIRST_NAME,EMP_AGE from EMPLOYEE_TABLE where EMP_LAST_NAME like %:lastname ",nativeQuery = true)
    public List<Object[]> findAllWithThisLastName(@Param("lastname") String lastname);

    @Modifying
    @Query(value = "delete from EMPLOYEE_TABLE where EMP_AGE > :age",nativeQuery = true)
    @Transactional
    public int deleteEmployeWithAgeGreaterThan(@Param("age") int age);
}
