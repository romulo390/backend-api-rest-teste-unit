package br.com.romulo.api_teste_unitario.common.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErroResponse {

    private Long timestamp;
    private Integer status;
    private String message;
    private String path;
}
