package senai.br.saep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class C_Cadastro {
    @GetMapping("/")
    public String getCadastro() {
        return "index";
    }

    @PostMapping
    public String postCadastro(@RequestParam("nome") String nome,
                               @RequestParam("email") String email){
return null;
    }



}
