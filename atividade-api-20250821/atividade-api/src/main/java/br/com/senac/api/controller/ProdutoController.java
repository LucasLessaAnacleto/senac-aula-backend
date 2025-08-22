package br.com.senac.api.controller;

import br.com.senac.api.controller.dto.ProdutoRequestDTO;
import br.com.senac.api.model.Produto;
import br.com.senac.api.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;



    @PostMapping("/adicionar-produto")
    public ResponseEntity<Void>adicionarProduto(@RequestBody ProdutoRequestDTO produto){
        System.out.println(produto.toString());
        return ResponseEntity.ok(null);
    }

    @GetMapping("/listar-produto")
    public ResponseEntity<List<Produto>>listarProduto(){
        return ResponseEntity.ok(produtoService.listarProduto());
    }
}
