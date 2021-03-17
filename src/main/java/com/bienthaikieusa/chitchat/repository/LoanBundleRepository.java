package com.bienthaikieusa.chitchat.repository;

import com.bienthaikieusa.chitchat.model.LoanBundle;
import com.bienthaikieusa.chitchat.model.Message;
import com.bienthaikieusa.chitchat.model.Transaction;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LoanBundleRepository extends CrudRepository<LoanBundle, Long> {

    @Query("SELECT lbd.rate From LoanBundle lbd WHERE lbd.bundleId = :bundleid")
    public int findLoanRate(@Param("bundleid") Long bundleId);

    @Query("SELECT lbd From LoanBundle lbd WHERE lbd.bundleId = :bundleid")
    public Optional<LoanBundle> findByLBundleID(@Param("bundleid") Long bundleId);
}
