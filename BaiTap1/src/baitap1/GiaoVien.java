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
public class GiaoVien extends CaNhan {
    public String monDay;
    public String toBoMon;
    
    public GiaoVien(String hoTen, int tuoi, String diaChi, String sdt, String monDay, String toBoMon)
    {
        super(hoTen,tuoi,diaChi,sdt);
        this.monDay = monDay;
        this.toBoMon=toBoMon;
    }
    
    public String getMonday()
    {   
        return monDay;
    }
    public void setMonday(String monDay)
    {
        this.monDay=monDay;
    }
    
    public String getToBoMon()
    {   
        return toBoMon;
    }
    public void setToBoMon(String toBoMon)
    {
        this.toBoMon=toBoMon;
    }
    
    String HienThiTT(){
        return "Ten: "+getHoten()+" Tuoi: "+getTuoi()+" Dia chi:"+getDiachi()+" SDT: "+getSdt()+" Lop: "+getMonday()+" Nang khieu"+getToBoMon();
    }
}
