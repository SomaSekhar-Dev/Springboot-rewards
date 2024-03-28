package com.java.rewards.service;

import com.java.rewards.model.Transaction;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface RewardsService {
    Map<String, String> calculateRewardPoints();
    List<Transaction> getAllTransactions();
}
