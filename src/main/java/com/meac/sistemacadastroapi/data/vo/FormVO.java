package com.meac.sistemacadastroapi.data.vo;

import java.io.Serializable;
import java.util.Objects;

public class FormVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String question;

    public FormVO() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FormVO formVO = (FormVO) o;
        return Objects.equals(id, formVO.id) && Objects.equals(question, formVO.question);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, question);
    }
}
