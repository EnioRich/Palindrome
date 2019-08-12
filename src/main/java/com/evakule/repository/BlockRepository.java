package com.evakule.repository;

import com.evakule.model.Block;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface BlockRepository extends JpaRepository<Block, Long> {

    List<Block> findByFirstPalindrome(String status);

}