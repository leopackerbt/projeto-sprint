package com.br.bandtec.projetosprint;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/gshop")
public class Controller {

    private List<Pessoa> usuarios = new ArrayList<>();

    @GetMapping("/listarUsuarios")
    public List<Pessoa> getUsuarios() {
        return usuarios;
    }

    @GetMapping("/listarUsuario/{id}")
    public Pessoa getUsuario(@PathVariable int id) {
        return usuarios.get(id-1);
    }

    @PostMapping("/cadastrar/usuario")
    public void cadastrarUsuario(@RequestBody Usuario usuario) {
        usuarios.add(usuario);
    };

    @PostMapping("/cadastrar/usuariovip")
    public void cadastrarUsuarioVIP(@RequestBody UsuarioVIP usuariovip) {
        usuarios.add(usuariovip);
    };

    @PostMapping("/cadastrar/funcionario")
    public void cadastrarFuncionario(@RequestBody Funcionario funcionario) {
        usuarios.add(funcionario);
    };

    @DeleteMapping("/excluirUsuario/{id}")
    public void excluirUsuario(@PathVariable int id) {
        usuarios.remove(id-1);
    }
}
