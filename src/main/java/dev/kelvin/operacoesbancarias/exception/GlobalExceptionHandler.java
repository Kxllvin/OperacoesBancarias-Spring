package dev.kelvin.operacoesbancarias.exception;

import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(SaldoInsuficienteException.class)
	public ResponseEntity<Map<String, String>> handleSaldoInsuficiente(
			SaldoInsuficienteException e){
		return ResponseEntity.badRequest().body(Map.of(
				"erro", e.getMessage()
		));
	}
	
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<Map<String, String>> handleValorInvalido(
			IllegalArgumentException e){
		return ResponseEntity.badRequest().body(Map.of(
				"erro", e.getMessage()
		));
	}

}
