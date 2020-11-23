package com.hsenid.HRmanagementsystem.repository;

import com.hsenid.HRmanagementsystem.Model.Sbu;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SbuRepository  extends CrudRepository<Sbu, Integer> {
}
