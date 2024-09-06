
package Modelos;

import java.util.Date;


public class Cliente extends Pessoa {
    
    private String cep;
    private String endereco;

    public Cliente(String cep, String endereco, int id, String nome, char sexo, Date dataNascimento, String telefone, String email, String rg) {
        super(id, nome, sexo, dataNascimento, telefone, email, rg);
        this.cep = cep;
        this.endereco = endereco;
    }
    
    public Cliente( int id , String nome , String endereco ,String cep) {
        super(id, nome);
        this.cep = cep;
        this.endereco = endereco;
    }
    
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    
    
}
