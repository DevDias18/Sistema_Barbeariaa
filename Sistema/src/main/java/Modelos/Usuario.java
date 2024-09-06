/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.Date;

/**
 *
 * @author geova
 */
public class Usuario extends Pessoa {
    
    protected String senha;
    protected String nivelDeAcesso;

    public Usuario(int id, String nome , String senha) {
        super(id, nome);
        this.senha = senha;
    }

    public Usuario(String senha, String nivelDeAcesso, int id, String nome, char sexo, Date dataNascimento, String telefone, String email, String rg) {
        super(id, nome, sexo, dataNascimento, telefone, email, rg);
        this.senha = senha;
        this.nivelDeAcesso = nivelDeAcesso;
    }

    


}
