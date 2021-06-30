package br.com.tiago.tat.ads.cliente.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.tiago.tat.ads.cliente.dto.ClienteDTO;
import br.com.tiago.tat.ads.cliente.dto.ClienteDetalhadoDTO;
import br.com.tiago.tat.ads.cliente.form.ClienteFORM;
import br.com.tiago.tat.ads.cliente.model.Cliente;
import br.com.tiago.tat.ads.cliente.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	public ResponseEntity<List<ClienteDTO>> listarClientes() {
		List<Cliente> clientes = this.clienteRepository.findAll();
		if (clientes.isEmpty()) {
			System.out.println("Lista vazia");
		}
		return ResponseEntity.ok().body(ClienteDTO.converter(clientes));
	}

	public ResponseEntity<Void> cadastrarCliente(ClienteFORM novoCliente) {
		Cliente cliente = new Cliente(novoCliente);
		this.clienteRepository.save(cliente);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	public ResponseEntity<Void> deletarCliente(Long id) {
		Cliente cliente = this.buscarClientePorId(id);
		this.clienteRepository.deleteById(cliente.getId());
		return ResponseEntity.status(HttpStatus.OK).build();

	}

	public ResponseEntity<ClienteDetalhadoDTO> listarDadosCliente(Long id) {
		Cliente cliente = this.buscarClientePorId(id);
		return ResponseEntity.status(HttpStatus.OK).body(new ClienteDetalhadoDTO(cliente));
	}

	public ResponseEntity<Void> atualizarCliente(Long id, ClienteFORM clienteForm) {
		Cliente cliente = this.buscarClientePorId(id);
		Cliente clienteAtualizado = this.atualizarAtributosCliente(cliente, clienteForm);
		this.clienteRepository.save(clienteAtualizado);
		return ResponseEntity.status(HttpStatus.OK).build();

	}

	private Cliente atualizarAtributosCliente(Cliente cliente, ClienteFORM clienteForm) {
		cliente.setNome(clienteForm.getNome());
		cliente.setSobreNome(clienteForm.getSobreNome());
		cliente.setNacionalidade(clienteForm.getNacionalidade());
		cliente.setProfissao(clienteForm.getProfissao());
		cliente.setEndereco(clienteForm.getEndereco());
		cliente.setCpf(clienteForm.getCpf());
		return cliente;
	}

	private Cliente buscarClientePorId(Long id) {
		Optional<Cliente> cliente = this.clienteRepository.findById(id);
		if (!cliente.isPresent()) {
			System.out.println("Cliente não encontrado");
		}
		return cliente.get();
	}


}
