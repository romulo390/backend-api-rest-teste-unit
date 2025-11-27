package br.com.romulo.api_teste_unitario.service;

import br.com.romulo.api_teste_unitario.dto.UsuarioDTO;
import br.com.romulo.api_teste_unitario.entity.Usuario;

import java.util.List;

public interface IUsuarioService {

    Usuario incluir(UsuarioDTO usuario);
    Usuario findById(Integer id);
    List<Usuario> findAll();
    Usuario update(UsuarioDTO usuario);
}
