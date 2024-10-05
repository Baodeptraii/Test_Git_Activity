package com.example.web_manager_book.Repository.Query;
import com.example.web_manager_book.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueryIF extends JpaRepository<Customer,Long> {



}
