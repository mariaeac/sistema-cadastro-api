package com.meac.sistemacadastroapi;

import com.meac.sistemacadastroapi.model.Form;
import com.meac.sistemacadastroapi.repositories.FormRepository;
import com.meac.sistemacadastroapi.service.FormServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/form")
public class FormController {

    @Autowired
    private FormServices formService;

    @GetMapping
    public List<Form> loadForm() {
        return formService.getAllQuestions();
    }


}
