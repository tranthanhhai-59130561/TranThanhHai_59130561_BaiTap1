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
public class BaiTap1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Hoc Sinh
        HocSinh hs1 = new HocSinh("Tran Thanh Hai",23,"Nha Trang","09124232","59cntt2","Hat");
        HocSinh hs2 = new HocSinh("Nguyen Quoc Huy",20,"Dien Khanh","0565484","59cntt2","Mua");
        HocSinh hs3 = new HocSinh("Le Van Luong",21,"Ninh Hoa","094512221","59cntt2","khong co");
        
        // Giao Vien
        GiaoVien gv1 = new GiaoVien("Nguyen Dang Khoa",26,"Phu Yeu","05357968","Van","Toan");
        GiaoVien gv2 = new GiaoVien("Nguyen An Huy",24,"Binh Dinh","02343644","Ly","Anh");
        GiaoVien gv3 = new GiaoVien("Tran Huu Duc",25,"Ha Noi","09277842","TinHoc","Hoa");
        
        // Them hoc sinh vao lop hoc
        LopHoc lopHoc = new LopHoc();
        lopHoc.themHS(hs2);
        lopHoc.themHS(hs1);
        lopHoc.themHS(hs1);
        lopHoc.themHS(hs3);
        
        // Them giao vien vao lop hoc
        lopHoc.themGV(gv1);
        lopHoc.themGV(gv3);
        lopHoc.themGV(gv2);
        lopHoc.themGV(gv2);

        System.out.println("In danh sach hoc sinh: ");
        lopHoc.inDSHS();
        System.out.println("In danh sach giao vien: ");
        lopHoc.inDSGV();
    }
    
}
