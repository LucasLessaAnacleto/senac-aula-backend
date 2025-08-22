package br.com.senac.api.service;

import br.com.senac.api.controller.dto.ProdutoRequestDTO;
import br.com.senac.api.model.Produto;
import br.com.senac.api.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public void adicionarProduto(ProdutoRequestDTO produto){
        Produto produtoPersist = new Produto();

        produtoPersist.setDescricao(produto.getDescricao());
        produtoPersist.setNome(produto.getNome());

        produtoRepository.save(produtoPersist);
    }

    public List<Produto> listarProduto(){
        return produtoRepository.findAll();
    }
}
