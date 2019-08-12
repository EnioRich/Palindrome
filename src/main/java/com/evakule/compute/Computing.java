package com.evakule.compute;

import com.evakule.model.Block;
import com.evakule.repository.BlockRepository;
import com.evakule.util.CalculatePalindrome;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Component
public class Computing {

    @Autowired
    BlockRepository blockRepository;

    @Scheduled(fixedRate = 3000)
    private void doSomething() {
        List<Block> blockList = blockRepository.findByFirstPalindrome("Calculating");
        CompletableFuture.runAsync(
                () -> processCreatedBlock(blockList)); // only for status Calculating
    }

    public void processCreatedBlock(List<Block> blockList) {
        blockList.stream().peek(this::computeBlockPalindromes)
                .forEach(blockRepository::save);
    }

    private void computeBlockPalindromes(Block block) {
        Long firstPalindrome = getFirstPalindrome(block);
        Long lastPalindrome = getLastPalindrome(block);

        block.setFirstPalindrome(String.valueOf(firstPalindrome));
        block.setLastPalindrome(String.valueOf(lastPalindrome));
    }

    private Long getFirstPalindrome(Block block) {
        return CalculatePalindrome.
                getFirstPalindrome(block.getStartNumber(), block.getPalindromeCount());
    }

    private Long getLastPalindrome(Block block) {
        return CalculatePalindrome.
                getLastPalindrome(block.getStartNumber(), block.getPalindromeCount());
    }
}