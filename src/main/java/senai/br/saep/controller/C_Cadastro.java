package senai.br.saep.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import senai.br.saep.service.S_Cadastro;

@Controller
public class C_Cadastro {
    @GetMapping("/")
    public String getCadastro() {
        return "index";
    }

    @PostMapping
    public String postCadastro(@RequestParam("nome") String nome,
                               @RequestParam("email") String email,
                               Model model){

        if (S_Cadastro.cadastrarUsuario(nome,email) == null) {
            return "redirect:/cadastro";
        } else {
            return "redirect:/";
        }


    }
}




