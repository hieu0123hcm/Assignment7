package com.bienthaikieusa.chitchat.repository;

import com.bienthaikieusa.chitchat.model.Admin;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends CrudRepository<Admin,String> {
    @Query("SELECT l FROM Admin l WHERE l.account_id = :account_id")
    public Admin findByAccountID(@Param("account_id") Long account_id);
}
