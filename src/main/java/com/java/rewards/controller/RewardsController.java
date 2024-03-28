package com.java.rewards.controller;

import com.java.rewards.model.Transaction;
import com.java.rewards.service.RewardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/rewards")
public class RewardsController {
    @Autowired
    RewardsService rewardService;

    @GetMapping("/calculate")
    public Map<String, String> calculateRewardPoints() {
        // Call the service method to calculate reward points
        return rewardService.calculateRewardPoints();
    }

    @GetMapping("/transactions")
    public List<Transaction> getAllTransactions() {
        // Call the service method to fetch all transactions
        return rewardService.getAllTransactions();
    }
}