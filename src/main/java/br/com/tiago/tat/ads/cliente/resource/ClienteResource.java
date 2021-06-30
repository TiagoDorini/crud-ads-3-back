package br.com.tiago.tat.ads.cliente.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tiago.tat.ads.cliente.dto.ClienteDTO;
import br.com.tiago.tat.ads.cliente.dto.ClienteDetalhadoDTO;
import br.com.tiago.tat.ads.cliente.form.ClienteFORM;
import br.com.tiago.tat.ads.cliente.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteResource {

	@Autowired
	private ClienteService clienteService;

	@PostMapping
	public ResponseEntity<Void> cadastrarCliente(@RequestBody ClienteFORM novoCliente) {
		return this.clienteService.cadastrarCliente(novoCliente);
	}
	
	@GetMapping
	public ResponseEntity<List<ClienteDTO>> listarClientes() {
		return clienteService.listarClientes();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ClienteDetalhadoDTO> listarDadosClientePorId(@PathVariable Long id) {
		return this.clienteService.listarDadosCliente(id);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> apagarCliente(@PathVariable Long id) {
		return this.clienteService.deletarCliente(id);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Void> atualizarCliente(@PathVariable Long id, @RequestBody ClienteFORM clienteForm) {
		return this.clienteService.atualizarCliente(id, clienteForm);
	}
	

}
