package br.com.romulo.api_teste_unitario.common.exceptions;

import br.com.romulo.api_teste_unitario.common.dto.response.ErroResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<ErroResponse> handleException(ObjectNotFoundException ex, HttpServletRequest request) {

        ErroResponse erroResponse =
                new ErroResponse(Instant.now().toEpochMilli(), HttpStatus.NOT_FOUND.value(), ex.getMessage(),request.getRequestURI());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erroResponse);
    }
}
