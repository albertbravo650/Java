package com.albertbravo.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.albertbravo.savetravels.models.Expense;
import com.albertbravo.savetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	// adding the book repository as a dependency
	private final ExpenseRepository expenseRepository;
	
	public ExpenseService(ExpenseRepository expenseRepository) {
		this.expenseRepository = expenseRepository;
	}
	
	// returns all books
	public List<Expense> allExpenses() {
		return expenseRepository.findAll();
	}
	
	public Expense createExpense(Expense e) {
		return expenseRepository.save(e);
	}
	
	public Expense findExpense(Long id) {
		Optional<Expense> optionalExpense = expenseRepository.findById(id);
		if(optionalExpense.isPresent()) {
			return optionalExpense.get();
		}
		else {
			return null;
		}
	}
	
	public Expense updateExpense(Expense changedExpense) {
		return expenseRepository.save(changedExpense);
	}
		
	//Delete a book
	public void deleteExpense(Long id) {
		expenseRepository.deleteById(id);
	}
}
