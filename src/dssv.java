
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
import java.io.*;
public class dssv {
      int n;
        sv ds[];
        void nhapds() throws IOException{
             BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Nhap danh sach sinh vien");
            System.out.println("Nhap so sinh vien:");
            n=Integer.parseInt(buf.readLine());
            ds=new sv[n];
            for(int i=0;i<n;i++){
                System.out.println("Nhap thong tin cho sinh vien thu"+(i+1));
                sv x=new sv();
                x.nhap();
                ds[i]=x;
            }
        }
        void xuatds(){
            System.out.println("Danh sach sinh vien");
            for(int i=0;i<n;i++){
                System.out.println(" "+(i+1));
                ds[i].xuat();
            }
        }
        void tuoi25(){
            int t=0;
            System.out.println("Danh sach sinh vien co tuoi lon hon 25");
            for(int i=0;i<n;i++)
                if(ds[i].tuoi>25){
                    System.out.println(" "+(++t));
                    ds[i].xuat();
                }
        }
        void svkha(){
            int dem=0;
            System.out.println("Danh sach sinh vien kha");
            for(int i=0;i<n;i++)
                if(ds[i].dtb>7){
                    dem++;
                    System.out.println(" "+(i+1));
                    ds[i].xuat();
                }
            System.out.println("Tong so sinh vien dat loai kha:"+dem);
        }
    }

