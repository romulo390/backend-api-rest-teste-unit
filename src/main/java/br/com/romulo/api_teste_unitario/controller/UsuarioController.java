package br.com.romulo.api_teste_unitario.controller;

import br.com.romulo.api_teste_unitario.dto.UsuarioDTO;
import br.com.romulo.api_teste_unitario.service.IUsuarioService;
import br.com.romulo.api_teste_unitario.entity.Usuario;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user/v1")
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;

    @Autowired
    private ModelMapper mapper;

//    public ResponseEntity<Usuario> incluir(@RequestBody Usuario usuario) {
//
//    }

    @GetMapping(value = "/usuario/{id-usuario}")
    public ResponseEntity<UsuarioDTO> getUsuarioId(@PathVariable("id-usuario") Integer idUsuario){
        return ResponseEntity.ok().body(mapper.map(usuarioService.findById(idUsuario), UsuarioDTO.class));
    }

    @GetMapping()
    public ResponseEntity<List<UsuarioDTO>> listarTodosUsuarios(){
        List<UsuarioDTO> listUsuarioDTO = usuarioService.findAll()
                .stream()
                .map(usuario ->mapper.map(usuario,UsuarioDTO.class))
                .collect(Collectors.toList());
        return ResponseEntity.ok().body(listUsuarioDTO);
    }

}
