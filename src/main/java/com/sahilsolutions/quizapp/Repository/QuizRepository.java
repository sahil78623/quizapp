package com.sahilsolutions.quizapp.Repository;

import com.sahilsolutions.quizapp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz, Integer> {

}
