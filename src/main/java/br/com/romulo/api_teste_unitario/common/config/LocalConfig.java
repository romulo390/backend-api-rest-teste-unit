package br.com.romulo.api_teste_unitario.common.config;

import br.com.romulo.api_teste_unitario.entity.Usuario;
import br.com.romulo.api_teste_unitario.repositories.UsuarioRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostConstruct
    public void incluirUsuarioDB(){
        Usuario usuario1 = new Usuario(null,"Romulo","romulo@mail.com","1234");
        Usuario usuario2 = new Usuario(null,"Romario","romario@mail.com","1234");

        usuarioRepository.saveAll(List.of(usuario1,usuario2));

    }

}
