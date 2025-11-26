package br.com.romulo.api_teste_unitario.service;

import br.com.romulo.api_teste_unitario.entity.Usuario;

public interface IUsuarioService {

    Usuario findById(Integer id);
    Usuario incluir(Usuario usuario);
}
