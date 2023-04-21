package com.church.tci.repository;

import com.church.tci.model.ChurchMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.Nullable;

import java.util.List;
import java.util.Optional;

public interface ChurchMemberRepository extends JpaRepository<ChurchMember, Long> {

    @Query("select c from ChurchMember c where c.phoneNumber = ?1")
    ChurchMember findByPhoneContact(String phoneNumber);



}
