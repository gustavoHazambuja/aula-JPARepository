package com.devsuperior.aulaJPARepository.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.aulaJPARepository.Entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
    
}
