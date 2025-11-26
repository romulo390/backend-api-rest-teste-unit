package br.com.romulo.api_teste_unitario.service;

import br.com.romulo.api_teste_unitario.dto.UsuarioDTO;
import br.com.romulo.api_teste_unitario.entity.Usuario;

import java.util.List;

public interface IUsuarioService {

    Usuario findById(Integer id);
    Usuario incluir(UsuarioDTO usuario);
    List<Usuario> findAll();
}
