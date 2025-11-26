package br.com.romulo.api_teste_unitario.repositories;

import br.com.romulo.api_teste_unitario.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {

}
