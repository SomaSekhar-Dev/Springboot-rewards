package com.java.rewards.repository;

import com.java.rewards.model.Transaction;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class TransactionRepositoryImpl  implements TransactionRepository {
        @Override
    public List<Transaction> findAll() {
                 // Create and return mock transaction objects
            List<Transaction> transactions = new ArrayList<>();
            transactions.add(new Transaction(1L, "Customer1001", 50.0, LocalDate.of(2022, 3, 1)));
            transactions.add(new Transaction(2L, "Customer1002", 120.0, LocalDate.of(2022, 3, 5)));
            transactions.add(new Transaction(3L, "Customer1003", 80.0, LocalDate.of(2022, 3, 10)));
            transactions.add(new Transaction(4L, "Customer1004", 150.0, LocalDate.of(2022, 3, 11)));
            transactions.add(new Transaction(5L, "Customer1005", 200.0, LocalDate.of(2022, 3, 15)));

            return transactions;
        }
  }
