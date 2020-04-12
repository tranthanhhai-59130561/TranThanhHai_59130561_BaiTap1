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
public class HocSinh extends CaNhan {
    public String lop;
    public String nangKhieu;
    
    public HocSinh(String hoTen, int tuoi, String diaChi, String sdt, String lop, String nangKhieu)
    {
        super(hoTen,tuoi,diaChi,sdt);
        this.lop=lop;
        this.nangKhieu=nangKhieu;
    }
    
    public String getLop()
    {
        return lop;
    }
    public void setLop(String lop)
    {
        this.lop = lop;
    }
    
    public String getNangkhieu()
    {
        return nangKhieu;
    }
    public void setNangkhieu(String nangKhieu)
    {
        this.nangKhieu=nangKhieu;
    }
    
    String HienThiTT(){
        return "Ten: "+getHoten()+"Tuoi: "+getTuoi()+"Dia chi:"+getDiachi()+"SDT: "+getSdt()+"Lop: "+getLop()+"Nang khieu"+getNangkhieu();
    }
}
