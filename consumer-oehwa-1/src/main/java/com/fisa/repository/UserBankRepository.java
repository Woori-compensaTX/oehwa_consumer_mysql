package com.fisa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fisa.entity.UserBank;

public interface UserBankRepository extends JpaRepository<UserBank, String> {
    @Query(value = """
            SELECT * FROM (
                SELECT * FROM user_bank
                WHERE user_id = :userId
            )
            WHERE ROWNUM = 1
            """, nativeQuery = true)
    Optional<UserBank> findLatestByUserId(@Param("userId") String userId);

}
