package senai.br.saep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import senai.br.saep.model.M_Usuario;

public interface R_Usuario extends JpaRepository<M_Usuario, Long> {
    @Query(value = "SELECT * FROM usuario WHERE email = :email AND nome = :nome  LIMIT 1", nativeQuery = true)
    M_Usuario findByEmailAndNome(@Param("email") String email, @Param("nome") String nome);

}
