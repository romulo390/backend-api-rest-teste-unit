package br.com.romulo.api_teste_unitario.util;

import br.com.romulo.api_teste_unitario.common.exceptions.DataIntegratyViolationExceprion;
import br.com.romulo.api_teste_unitario.dto.UsuarioDTO;
import br.com.romulo.api_teste_unitario.entity.Usuario;
import br.com.romulo.api_teste_unitario.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

//@Component
public class Utils {

   // @Autowired
//    private static UsuarioRepository usuarioRepository;

//    public static void checkUsuario(UsuarioDTO usuarioDTO){
//        Optional<Usuario> usuario = usuarioRepository.findByEmail(usuarioDTO.getEmail());
//        if(usuario.isPresent()){
//            throw new DataIntegratyViolationExceprion("Usuário já cadastrado para esse email!");
//        }
//    }
}
