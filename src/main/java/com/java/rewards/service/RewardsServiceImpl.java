package com.java.rewards.service;

import com.java.rewards.model.Transaction;
import com.java.rewards.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;

@Service
public class RewardsServiceImpl implements RewardsService {

    @Autowired
    TransactionRepository transactionRepository;
    @Override
    public Map<String, String> calculateRewardPoints() {
        List<Transaction> transactions = transactionRepository.findAll();
        Map<String, String> rewardPointsMap = new Hashtable<>();
        // Your reward points calculation logic here
        // A customer receives 2 points for every dollar spent over $100 in each transaction,
        // plus 1 point for every dollar spent between $50 and $100 in each transaction.
        //(e.g. a $120 purchase = 2x$20 + 1x$50 = 90 points).

        double rewardPoints = 0;
        for (Transaction transaction : transactions) {
            if(transaction.getAmount() > 100) {
                rewardPoints += (transaction.getAmount() - 100) * 2;
            }
            if(transaction.getAmount() >= 50 && transaction.getAmount() <= 100) {
                rewardPoints += transaction.getAmount() - 50;
            }
            rewardPointsMap.put(transaction.getCustomerId(), rewardPoints + " reward points");
        }

        return rewardPointsMap;
    }

    @Override
    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }
}
