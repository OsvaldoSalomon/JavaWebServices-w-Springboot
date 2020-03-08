package com.osvaldo.learning.jpa.service;

import com.osvaldo.learning.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
