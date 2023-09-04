/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


/**
 *
 * @author julianob
 */
public class Funcionario {
  private String nome;
    private String cargo;
    private String senha;

    public Funcionario(String nome, String cargo, String senha) {
        this.nome = nome;
        this.cargo = cargo;
        this.senha = senha;

    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
   @Override
    public String toString() {
        return "Funcionario{" +
                "Nome='" + nome + '\'' +
                ", Cargo='" + cargo+
                '}';
    } 
}
