/**
 * Created By Krishna Shinde
 * Date : 28-06-2023
 * Time : 16:12
 * Project: OneToManyHibernateSaveAndFetchData
 **/

package com.mahagan.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    private String questionName;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name ="qid")
    @OrderColumn(name = "type")
    private List<Answers> answers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    public List<Answers> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answers> answers) {
        this.answers = answers;
    }
}


