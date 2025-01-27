package com.meac.sistemacadastroapi.service;

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

    public Form addNewQuestino(Form form) {
        return formRepository.save(form);
    }


}
