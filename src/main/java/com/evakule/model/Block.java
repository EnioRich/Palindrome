package com.evakule.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BLOCK")
public class Block {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "START_NUMBER")
    private Long startNumber;

    @Column(name = "PALINDROME_COUNT")
    private Long palindromeCount;

    @Column(name = "FIRST_PALINDROME")
    private String firstPalindrome;

    @Column(name = "LAST_PALINDROME")
    private String lastPalindrome;

    public Block() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStartNumber() {
        return startNumber;
    }

    public void setStartNumber(Long startNumber) {
        this.startNumber = startNumber;
    }

    public Long getPalindromeCount() {
        return palindromeCount;
    }

    public void setPalindromeCount(Long palindromeCount) {
        this.palindromeCount = palindromeCount;
    }

    public String getFirstPalindrome() {
        return firstPalindrome;
    }

    public void setFirstPalindrome(String firstPalindrome) {
        this.firstPalindrome = firstPalindrome;
    }

    public String getLastPalindrome() {
        return lastPalindrome;
    }

    public void setLastPalindrome(String lastPalindrome) {
        this.lastPalindrome = lastPalindrome;
    }
}