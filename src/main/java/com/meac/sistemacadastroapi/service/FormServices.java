package com.meac.sistemacadastroapi.service;

import com.meac.sistemacadastroapi.exceptions.BadRequestException;
import com.meac.sistemacadastroapi.exceptions.ResourceNotFoundException;
import com.meac.sistemacadastroapi.model.Form;

import com.meac.sistemacadastroapi.repositories.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormServices {

    @Autowired
    private FormRepository formRepository;

    public List<Form> getAllQuestions() {
        return formRepository.findAll();
    }

    public Form addNewQuestion(Form form) {
        return formRepository.save(form);
    }

    public void deleteQuestion(Long id) {
        if (id <= 4) {
            throw new BadRequestException("Não é possível apagar as 4 primeiras perguntas");
        }
        formRepository.deleteById(id);
    }

    public Form updateQuestion(Form form) {

        if (form.getId() <= 4) {
            throw new BadRequestException("Não é possível alterar as quatro primeiras perguntas");
        }

       Form question = formRepository.findById(form.getId()).orElseThrow(() -> new ResourceNotFoundException("Nenhuma pergunta encontrada com esse ID"));
       question.setQuestion(form.getQuestion());
       formRepository.save(question);
       return question;
    }


}
