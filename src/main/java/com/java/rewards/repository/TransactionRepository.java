package com.java.rewards.repository;

import com.java.rewards.model.Transaction;

import java.util.List;
import java.util.Map;

public interface TransactionRepository {

    List<Transaction> findAll();
  }
