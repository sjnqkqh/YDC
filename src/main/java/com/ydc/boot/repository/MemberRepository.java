package com.ydc.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ydc.boot.model.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
