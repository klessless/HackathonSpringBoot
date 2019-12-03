package com.greenloan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;

@Indexed
@Entity
public class Loan {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private long id;
	    @Field
	    private String borrower;
	    @Field
	    private String loanPurposeType;
	    @Field
	    private long accountNumber;
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getBorrower() {
			return borrower;
		}
		public void setBorrower(String borrower) {
			this.borrower = borrower;
		}
		public String getLoanPurposeType() {
			return loanPurposeType;
		}
		public void setLoanPurposeType(String loanPurposeType) {
			this.loanPurposeType = loanPurposeType;
		}
		public long getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(long accountNumber) {
			this.accountNumber = accountNumber;
		}
	    
	    
}
