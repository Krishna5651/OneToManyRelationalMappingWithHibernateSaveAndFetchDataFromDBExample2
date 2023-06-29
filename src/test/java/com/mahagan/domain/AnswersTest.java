package com.mahagan.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AnswersTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Answers}
     *   <li>{@link Answers#setAnsName(String)}
     *   <li>{@link Answers#setCreatedBy(String)}
     *   <li>{@link Answers#setId(int)}
     *   <li>{@link Answers#setPostedBy(String)}
     *   <li>{@link Answers#getAnsName()}
     *   <li>{@link Answers#getCreatedBy()}
     *   <li>{@link Answers#getId()}
     *   <li>{@link Answers#getPostedBy()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Answers actualAnswers = new Answers();
        actualAnswers.setAnsName("Ans Name");
        actualAnswers.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        actualAnswers.setId(1);
        actualAnswers.setPostedBy("Posted By");
        assertEquals("Ans Name", actualAnswers.getAnsName());
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualAnswers.getCreatedBy());
        assertEquals(1, actualAnswers.getId());
        assertEquals("Posted By", actualAnswers.getPostedBy());
    }
}

