package com.evakule.service;

import com.evakule.model.Block;
import com.evakule.repository.BlockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PalindromeServiceImpl implements PalindromeService {

    @Autowired
    BlockRepository blockRepository;

    @Override
    public Optional<List<Block>> getAll() {
        return Optional.of(blockRepository.findAll());
    }

    @Override
    public Block addBlock(Block block) {
        block.setFirstPalindrome("Calculating");
        block.setLastPalindrome("Calculating");
        return blockRepository.save(block);
    }
}