package ru.serdyukov.ilya.CardWatcher.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.serdyukov.ilya.CardWatcher.services.CurrenciesService;

@Controller
@RequestMapping("/currencies")
public class CurrenciesController {

    private final CurrenciesService currenciesService;

    @Autowired
    public CurrenciesController(CurrenciesService currenciesService) {
        this.currenciesService = currenciesService;
    }

    @GetMapping("/")
    public void showListOfUsers(Model model) {
        model.addAttribute("currencies", currenciesService.findAll());
    }

    @GetMapping("/{id}")
    public void showUser(@PathVariable("id") int id, Model model) {
        model.addAttribute("currency", currenciesService.findOne(id));
    }

}
