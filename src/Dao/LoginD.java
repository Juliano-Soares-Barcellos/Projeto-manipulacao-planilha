/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.LoginModel;
import Model.Funcionario;
import java.util.List;

/**
 *
 * @author julianob
 */
public class LoginD {
   
        public String login(List<Funcionario> funcionarios, String ConfirmaNome, String ConfirmaSenha) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equals(ConfirmaNome) && funcionario.getSenha().equals(ConfirmaSenha)) {
                return funcionario.getCargo();
            }
        }
        return null;
    }
}
