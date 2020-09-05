package com.br.bandtec.projetosprint;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class Controller {

    private List<Pessoa> usuarios = new ArrayList<>();

    // mostrar todos os usuarios
    @GetMapping
    public ResponseEntity getUsuarios() {
        if (usuarios.isEmpty()) {
            return ResponseEntity.status(204).build();
        } else {
            return ResponseEntity.ok(usuarios);
        }
    }

    // mostrar o usuario por ID
    @GetMapping("/{id}")
    public ResponseEntity getUsuario(@PathVariable int id) {
        if (usuarios.size() >= id) {
            return ResponseEntity.ok(usuarios.get(id-1));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // para mostrar apenas os usuários do tipo comum
    @GetMapping("/comum")
    public ResponseEntity getUsuarioComum() {
        List<Pessoa> userComum = usuarios.stream()
                .filter(usuario -> usuario.getDescontoBase().equals(0.03))
                .collect(Collectors.toList());
        if(userComum.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(userComum);
        }
    }

    // para mostrar apenas os usuários do tipo vip
    @GetMapping("/vip")
    public ResponseEntity getUsuarioVIP() {
        List<Pessoa> userVIP = usuarios.stream()
                .filter(vip -> vip.getDescontoBase().equals(0.08))
                .collect(Collectors.toList());
        if(userVIP.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(userVIP);
        }
    }

    // para mostrar apenas os funcionarios
    @GetMapping("/funcionario")
    public ResponseEntity getFuncionario() {
        List<Pessoa> funcionario = usuarios.stream()
                .filter(func -> func.getDescontoBase().equals(0.10))
                .collect(Collectors.toList());
        if(funcionario.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(funcionario);
        }
    }

    @PostMapping("/comum")
    public ResponseEntity cadastrarUsuario(@RequestBody Usuario usuario) {
        usuarios.add(usuario);
        return ResponseEntity.status(201).build();
    };

    @PostMapping("/vip")
    public ResponseEntity cadastrarUsuarioVIP(@RequestBody UsuarioVIP usuariovip) {
        usuarios.add(usuariovip);
        return ResponseEntity.status(201).build();
    };

    @PostMapping("/funcionario")
    public ResponseEntity cadastrarFuncionario(@RequestBody Funcionario funcionario) {
        usuarios.add(funcionario);
        return ResponseEntity.status(201).build();
    };

    @DeleteMapping("/{id}")
    public ResponseEntity excluirUsuario(@PathVariable int id) {
        if (usuarios.size() >= id) {
            usuarios.remove(id-1);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }

    }
}
