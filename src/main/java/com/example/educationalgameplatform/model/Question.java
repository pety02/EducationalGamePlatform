package com.example.educationalgameplatform.model;
import java.util.List;

public class Question {
    private Long id;
    private String questionText;
    private Double score;
    List<Answer> possibleAnswers;
    List<Answer> correctAnswers;
}