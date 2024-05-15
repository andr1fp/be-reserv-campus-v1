package com.enigmacamp.reservationcampus.services.impl;

import com.enigmacamp.reservationcampus.model.entity.Transaction;
import com.enigmacamp.reservationcampus.model.entity.TransactionDetail;
import com.enigmacamp.reservationcampus.model.entity.constant.TypeFacilities;
import com.enigmacamp.reservationcampus.repository.TransactionRepository;
import com.enigmacamp.reservationcampus.services.ProfileService;
import com.enigmacamp.reservationcampus.services.TransactionDetailService;
import com.enigmacamp.reservationcampus.services.TransactionService;
import com.enigmacamp.reservationcampus.services.facilities.PlaceService;
import com.enigmacamp.reservationcampus.services.facilities.ToolService;
import com.enigmacamp.reservationcampus.services.facilities.TypeFacilitiesService;
import com.enigmacamp.reservationcampus.services.facilities.VehicleService;
import com.enigmacamp.reservationcampus.utils.constant.ETypeFacilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    TransactionRepository transactionRepository;
    TransactionDetailService transactionDetailService;
    TypeFacilitiesService typeFacilitiesService;
    ProfileService profileService;
    PlaceService placeService;
    ToolService toolsService;
    VehicleService vehicleService;

    @Autowired
    public TransactionServiceImpl(
            TransactionRepository transactionRepository,
            TransactionDetailService transactionDetailService,
            TypeFacilitiesService typeFacilitiesService,
            ProfileService profileService,
            PlaceService placeService,
            ToolService toolsService,
            VehicleService vehicleService) {
        this.transactionRepository = transactionRepository;
        this.transactionDetailService = transactionDetailService;
        this.typeFacilitiesService = typeFacilitiesService;
        this.profileService = profileService;
        this.placeService = placeService;
        this.toolsService = toolsService;
        this.vehicleService = vehicleService;
    }


    @Override
    @Transactional
    public Transaction saveTransaction(Transaction transaction) {
        transaction.setDateReservation(Date.valueOf(LocalDate.now()));

        return null;
    }

    @Override
    public Transaction getTransactionById(String id) {
        return null;
    }

    @Override
    public List<Transaction> getAllTransactions() {
        return List.of();
    }

    @Override
    public List<Transaction> findTransactionsbyName(String name) {
        return List.of();
    }

    @Override
    public Transaction updateTransaction(Transaction transaction) {
        return null;
    }

    @Override
    public void deleteTransaction(String id) {

    }
}