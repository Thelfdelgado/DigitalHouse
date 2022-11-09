package com.aula28.EcommerceCliente;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

import java.util.List;

public class ProdutoCliente {
    public Produto salvar(Produto produto){
        HttpResponse<String> response = null;
        Produto produto1 = null;
        try {
            response = Unirest.post("http://localhost:8080/produto/salvar")
                    .header("Content-Type", "application/json")
                    .body(JsonUtil.asJsonString(produto)).asString();
            produto1 = JsonUtil.objectFromString(Produto.class, response.getBody());
        }catch (Exception e){
            e.printStackTrace();
        }
        return produto1;
    }

    public List<Produto> buscarTodos(){
        HttpResponse<String> response = null;
        Produto produto1 = null;
        try {
            response = Unirest.get("http://localhost:8080/produto/").asString();
            produto1 = JsonUtil.objectFromString(Produto.class, response.getBody());
        }catch (Exception e){
            e.printStackTrace();
        }
        return (List<Produto>) produto1;
    }

    public Produto alterar(Produto produto){
        HttpResponse<String> response = null;
        Produto produto1 = null;
        try {
            response = Unirest.put("http://localhost:8080/produto/alterar")
                    .header("Content-Type", "application/json")
                    .body(JsonUtil.asJsonString(produto)).asString();
            produto1 = JsonUtil.objectFromString(Produto.class, response.getBody());
        }catch (Exception e){
            e.printStackTrace();
        }
        return produto1;
    }

    public String excluir(int id){
        HttpResponse<String> response = null;
        Produto produto1 = null;
        try {
            response = Unirest.delete("http://localhost:8080/produto"+id).asString();
        }catch (Exception e){
            e.printStackTrace();
        }
        return response != null ? String.valueOf(response.getStatus()) : null;
    }
}
