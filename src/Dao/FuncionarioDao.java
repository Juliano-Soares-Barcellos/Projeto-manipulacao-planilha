/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

/**
 *
 * @author julianob
 */

import Model.Funcionario;
import java.util.ArrayList;
import java.util.List;
public class FuncionarioDao {
    private List<Funcionario> funcionarios = new ArrayList<>();
 private Funcionario funcionario;

 
    public FuncionarioDao(){   
    funcionarios.add(new Funcionario("Fabricio", "Total",  "1234"));
        funcionarios.add(new Funcionario("Gilberto", "Total", "1234"));
        funcionarios.add(new Funcionario("Juliano", "Total", "1234"));
        funcionarios.add(new Funcionario("Armando", "Total", "1234"));
        funcionarios.add(new Funcionario("a", "medio", "1234"));
    
    }
     public List<Funcionario> getFuncionarios() {
        return funcionarios;

    }
}

