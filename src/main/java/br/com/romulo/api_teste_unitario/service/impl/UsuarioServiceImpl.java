package br.com.romulo.api_teste_unitario.service.impl;

import br.com.romulo.api_teste_unitario.common.exceptions.ObjectNotFoundException;
import br.com.romulo.api_teste_unitario.repositories.UsuarioRepository;
import br.com.romulo.api_teste_unitario.service.IUsuarioService;
import br.com.romulo.api_teste_unitario.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario findById(Integer id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        return usuario.orElseThrow(()->new ObjectNotFoundException("Usuario não encontrado!"));
    }

    @Override
    public Usuario incluir(Usuario usuario) {
        return null;
    }
}
