package br.com.taskgenius.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/extract")
public class controler {

    @GetMapping("/extrato")
    public String extrato(){
        return "\nNÃO PRECISA FUNCIONAR NADA SO IMPRIME ESSA PORRA!";
    }

}


















//METODOS DE ACESSO DO HTTP
/*
 * GET       -     Buscar um dado
 * POST      -     Adicionar um dado
 * PUT       -     Alterar um dado
 * DELETE    -     Remover um dado
 * PATCH     -     Alterar apenas uma parte do dado
 */