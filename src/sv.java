/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */import java.io.*;
public class sv {
    
        int masv;
        String hoten;
        int tuoi;
        float dtb;
        void nhap() throws IOException{
            BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Nhap va ma sinh vien");
            masv= Integer.parseInt(buf.readLine());
            System.out.println("Nhap ten sinh vien:");
            hoten=buf.readLine();
            System.out.println("Nhap vao tuoi:");
            tuoi=Integer.parseInt(buf.readLine());
            System.out.println("Nhap vao dtb");
            dtb=Float.parseFloat(buf.readLine());
        }
        void xuat(){
            System.out.println(masv+" "+hoten+" "+tuoi+" "+dtb);
        }
    
   

}
