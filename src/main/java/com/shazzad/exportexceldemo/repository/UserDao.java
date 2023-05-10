package com.shazzad.exportexceldemo.repository;

import com.shazzad.exportexceldemo.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<Users,Integer> {
}
