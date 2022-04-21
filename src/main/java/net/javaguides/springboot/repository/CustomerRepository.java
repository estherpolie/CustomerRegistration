package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long>
{

}
