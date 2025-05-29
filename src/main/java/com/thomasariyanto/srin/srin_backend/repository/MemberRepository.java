package com.thomasariyanto.srin.srin_backend.repository;

import com.thomasariyanto.srin.srin_backend.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
