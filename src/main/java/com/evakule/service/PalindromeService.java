package com.evakule.service;

import com.evakule.model.Block;

import java.util.List;
import java.util.Optional;

public interface PalindromeService {

    Optional<List<Block>> getAll();

    Block addBlock(Block block);
}
