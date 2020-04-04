package hackathon.covid19.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hackathon.covid19.domains.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}