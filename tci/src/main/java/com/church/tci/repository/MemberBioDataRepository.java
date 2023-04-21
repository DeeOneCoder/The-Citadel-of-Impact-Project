package com.church.tci.repository;

import com.church.tci.model.MemberBioData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberBioDataRepository extends JpaRepository<MemberBioData, Long> {
}
