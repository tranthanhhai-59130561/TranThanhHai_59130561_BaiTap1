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
public class QLDS implements IQLDS {
    public ArrayList<CaNhan> ds = new ArrayList<>();
    public ArrayList<CaNhan> getDs() 
    {
        return ds;
    }

    public void setDs(ArrayList<CaNhan> ds) 
    {
        this.ds = ds;
    }

    public int them(CaNhan cn) {       
        ds.add(cn);
        return 1;
    }

    public int xoa(String ten) 
    {     
            int j = -1;
            for (int i = 0; i < ds.size(); i++) 
            {
                if (ten.equals(ds.get(i).getHoten())) 
                {
                    j = i;
                    break;
                }
            }
            if (j > -1) 
            {
                ds.remove(j);
                return 1;
            } 
            else
            return 0;               
    }
   
        public void inDS() {
      ds.forEach(cn -> System.out.println(cn.HienThiTT()));
    }    
}
