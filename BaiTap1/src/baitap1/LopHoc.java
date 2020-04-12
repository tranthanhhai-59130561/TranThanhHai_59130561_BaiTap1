/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class LopHoc {
    private QLDS dshs = new QLDS();
    private QLDS dsgv = new QLDS();

   public int themHS(HocSinh hocSinh){
       dshs.them( hocSinh);
       return 1;
   }
   public int inDSHS(){
      dshs.inDS(dshs.getDs());
      return 1;
   }

    public int themGV(GiaoVien giaoVien){
        dsgv.them( giaoVien);
        return 1;
    }
    public int  inDSGV(){
        dsgv.inDS(dsgv.getDs());
        return 1;
    }
}
