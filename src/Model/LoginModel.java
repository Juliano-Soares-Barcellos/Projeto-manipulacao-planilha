/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.Funcionario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author julianob
 */
public class LoginModel {
          private Funcionario funcionarios;
    private List<String>senha=new ArrayList<>();
    private List<String>nome=new ArrayList<>();
    private List<String>cargo=new ArrayList<>();

    public Funcionario getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario funcionarios) {
        this.funcionarios = funcionarios;
    }

    public List<String> getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha .add(senha);
    }

    public List<String> getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome.add( nome);
    }

    public List<String> getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo.add(cargo);
    }
}
