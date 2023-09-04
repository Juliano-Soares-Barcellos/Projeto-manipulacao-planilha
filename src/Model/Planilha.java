/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author julianob
 */
public class Planilha {
    private String N;
    private String Material;
    private String CodigoDoProduto;
    private String Data;
    private String Garantia;
    private int IdasAoConserto;
    private String dias;

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }
      
    public Planilha(String Material, String CodigoDoProduto, String Garantia,String dias,int IdasAoConserto,String Data) {
        this.Material = Material;
        this.CodigoDoProduto = CodigoDoProduto;
        this.Data = Data;
        this.Garantia = Garantia;
        this.IdasAoConserto = IdasAoConserto;
        this.dias=dias;
    }

    public String getN() {
        return N;
    }

    public void setN(String N) {
        this.N = N;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public String getCodigoDoProduto() {
        return CodigoDoProduto;
    }

    public void setCodigoDoProduto(String CodigoDoProduto) {
        this.CodigoDoProduto = CodigoDoProduto;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public String getGarantia() {
        return Garantia;
    }

    public void setGarantia(String Garantia) {
        this.Garantia = Garantia;
    }

    public int getIdasAoConserto() {
        return IdasAoConserto;
    }

    public void setIdasAoConserto(int IdasAoConserto) {
        this.IdasAoConserto = IdasAoConserto;
    }
  
}
