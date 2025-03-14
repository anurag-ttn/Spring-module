package com.example.jpa2.repos;

import com.example.jpa2.single_table_strategy.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends JpaRepository<Person,Integer> {
}
