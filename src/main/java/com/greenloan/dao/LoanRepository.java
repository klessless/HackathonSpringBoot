package com.greenloan.dao;

import org.springframework.data.repository.CrudRepository;

import com.greenloan.model.Loan;

public interface LoanRepository extends CrudRepository<Loan, Long> {

}
