/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author Admin
 */
public class CaNhan {
    public String hoTen;
    public int tuoi;
    public String diaChi;
    public String sdt;
    
    public CaNhan(String hoTen, int tuoi, String diaChi, String sdt)
    {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }
    
    public String getHoten()
    {
        return hoTen;
    }
    
    public void setHoten(String hoTen)
    {
        this.hoTen = hoTen;
    }
    
    public int getTuoi()
    {
        return tuoi;
    }
    
    public void getTuoi(int tuoi)
    {
        this.tuoi = tuoi;
    }
    
    public String getDiachi()
    {
        return diaChi;
    }
    
    public void setDiachi(String diaChi)
    {
        this.diaChi = diaChi;
    }
    
    public String getSdt()
    {
        return sdt;
    }
    
    public void setSdt(String sdt)
    {
        this.sdt = sdt;
    }
    
    abstract String HienThiTT();
}
