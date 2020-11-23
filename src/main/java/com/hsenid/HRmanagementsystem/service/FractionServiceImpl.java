package com.hsenid.HRmanagementsystem.service;

import com.hsenid.HRmanagementsystem.Model.Fraction;
import com.hsenid.HRmanagementsystem.repository.FractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FractionServiceImpl implements FractionService{
    @Autowired
    private FractionRepository repository;
    @Override
    public List<Fraction> getAllFractions() {
        List<Fraction> fractions = new ArrayList<>();
        repository.findAll().forEach(fractions::add);
        return fractions;
    }
}
