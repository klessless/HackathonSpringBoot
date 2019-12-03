package com.greenloan.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.greenloan.dao.LoanRepository;
import com.greenloan.model.Loan;

@Service
public class LoanServiceImpl implements LoanService {
	
	@Autowired
	LoanRepository loanrepo;
	
	Loan L1 = new Loan();
	Loan L2 = new Loan();
	Loan L3 = new Loan();
	Loan L4 = new Loan();
	Loan L5 = new Loan();
	
	@Override
	public List<Loan> loanList() {
		List<Loan> list = new ArrayList<>();
		
		L1.setBorrower("Borrower 1");
		L1.setLoanPurposeType("loan purpose type 1");
		L1.setAccountNumber(123456789);
		list.add(L1);
		
		return list;
		
	}

}
