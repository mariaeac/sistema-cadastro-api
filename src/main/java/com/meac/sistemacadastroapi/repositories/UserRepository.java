package com.meac.sistemacadastroapi.repositories;


import com.meac.sistemacadastroapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

