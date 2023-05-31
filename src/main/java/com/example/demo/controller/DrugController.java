package com.example.demo.controller;

import org.springframework.ui.Model;

import com.example.demo.model.Drug;
import com.example.demo.repository.DrugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class DrugController {
    @Autowired
    private DrugRepository repository;

    @GetMapping("/")
    public String getAllDrug(Model model){
        List<Drug> drugs = repository.findAll();
        model.addAttribute("drugs",drugs);
        return "index";
    }

    @PostMapping(value = "/add")
    public String saveProduct(@ModelAttribute("drug")Drug drug){
        repository.save(drug);
        return "redirect:/";
    }
}
