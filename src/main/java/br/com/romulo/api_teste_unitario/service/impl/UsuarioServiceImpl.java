package br.com.romulo.api_teste_unitario.service.impl;

import br.com.romulo.api_teste_unitario.common.config.ModelMapperConfig;
import br.com.romulo.api_teste_unitario.common.exceptions.ObjectNotFoundException;
import br.com.romulo.api_teste_unitario.dto.UsuarioDTO;
import br.com.romulo.api_teste_unitario.repositories.UsuarioRepository;
import br.com.romulo.api_teste_unitario.service.IUsuarioService;
import br.com.romulo.api_teste_unitario.entity.Usuario;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private ModelMapper  mapper;

    @Override
    public Usuario findById(Integer id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        return usuario.orElseThrow(()->new ObjectNotFoundException("Usuario não encontrado!"));
    }

    @Override
    public Usuario incluir(UsuarioDTO usuario) {
        return usuarioRepository.save(mapper.map(usuario,Usuario.class));
    }

    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }
}
