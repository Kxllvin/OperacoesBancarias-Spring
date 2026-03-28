package dev.kelvin.operacoesbancarias.controller;

import dev.kelvin.operacoesbancarias.service.ContaService;
import java.math.BigDecimal;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/conta")
public class ContaController {
	
	private final ContaService contaService;
	
	public ContaController(ContaService contaService) {
		this.contaService = contaService;
	}
	
	@GetMapping("/saldo")
	public ResponseEntity<Map<String, Object>> consultarSaldo() {
		return ResponseEntity.ok(Map.of(
				"saldo", contaService.consultarSaldo()
		));
	}
	
	@PostMapping("/depositar")
	public ResponseEntity<Map<String, Object>> depositar(@RequestParam BigDecimal valor) {
		contaService.depositar(valor);
		return ResponseEntity.ok(Map.of(
				"mensagem", "Valor Depositado.",
				"saldo", contaService.consultarSaldo()
		));
	}
	
	@PostMapping("/sacar")
	public ResponseEntity<Map<String, Object>> sacar(@RequestParam BigDecimal valor) {
		contaService.sacar(valor);
		return ResponseEntity.ok(Map.of(
				"mensagem", "Valor Sacado.",
				"saldo", contaService.consultarSaldo()
		));
	}

}
