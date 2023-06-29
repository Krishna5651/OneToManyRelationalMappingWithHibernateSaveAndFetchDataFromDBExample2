package com.mahagan.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class QuestionTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Question}
     *   <li>{@link Question#setAnswers(List)}
     *   <li>{@link Question#setId(int)}
     *   <li>{@link Question#setQuestionName(String)}
     *   <li>{@link Question#getAnswers()}
     *   <li>{@link Question#getId()}
     *   <li>{@link Question#getQuestionName()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Question actualQuestion = new Question();
        ArrayList<Answers> answers = new ArrayList<>();
        actualQuestion.setAnswers(answers);
        actualQuestion.setId(1);
        actualQuestion.setQuestionName("Question Name");
        assertSame(answers, actualQuestion.getAnswers());
        assertEquals(1, actualQuestion.getId());
        assertEquals("Question Name", actualQuestion.getQuestionName());
    }
}

