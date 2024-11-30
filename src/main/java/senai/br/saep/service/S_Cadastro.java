package senai.br.saep.service;

import org.springframework.stereotype.Service;
import senai.br.saep.model.M_Usuario;
import senai.br.saep.repository.R_Usuario;

@Service
public class S_Cadastro {

    private static R_Usuario r_usuario ;


    public S_Cadastro(R_Usuario r_usuario) {
        this.r_usuario = r_usuario;
    }

    public static String cadastrarUsuario(String email, String nome) {



        M_Usuario m_usuario = new M_Usuario();
        m_usuario.setEmail(email);
        m_usuario.getNome(nome);


        r_usuario.save(m_usuario);

        return null;
    }

}