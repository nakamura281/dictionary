package com.example.dictionary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dictionary.entity.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}