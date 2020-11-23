package com.hsenid.HRmanagementsystem.service;

import com.hsenid.HRmanagementsystem.Model.Sbu;
import com.hsenid.HRmanagementsystem.repository.SbuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SbuServiceImpl implements SbuService{
    @Autowired
    private SbuRepository repository;
    @Override
    public List<Sbu> getAllSbus() {
        List<Sbu> sbus = new ArrayList<>();
        Iterable<Sbu> all = repository.findAll();
        all.forEach(sbus::add);

        return sbus;
    }
}
