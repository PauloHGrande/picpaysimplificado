package com.picpaysimplificado.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.picpaysimplificado.domain.transaction.Transaction;
import com.picpaysimplificado.dtos.TransactionDTO;
import com.picpaysimplificado.services.TransactionService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/transactions")
@Tag(name = "open-api-transactions")
public class TransactionControler {
	
	@Autowired
	private TransactionService transactionService;
	
	@Operation(summary = "Realiza a Transferencia", method = "POST")
	@PostMapping
	public ResponseEntity<Transaction> createTransaction(@RequestBody TransactionDTO transaction) throws Exception {
		Transaction newTransaction = this.transactionService.createTransaction(transaction);
		return new ResponseEntity<>(newTransaction, HttpStatus.OK);
	}

}
