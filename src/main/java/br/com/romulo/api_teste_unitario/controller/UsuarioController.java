package br.com.romulo.api_teste_unitario.controller;

import br.com.romulo.api_teste_unitario.service.IUsuarioService;
import br.com.romulo.api_teste_unitario.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/v1")
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;

//    public ResponseEntity<Usuario> incluir(@RequestBody Usuario usuario) {
//
//    }

    @GetMapping(value = "/usuario/{id-usuario}")
    public ResponseEntity<Usuario> getUsuario(@PathVariable("id-usuario") Integer idUsuario){
        return ResponseEntity.ok(usuarioService.findById(idUsuario));
    }

}
