package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class TrungTam {
    public ArrayList<Phong> listPhong;
    public ArrayList<NhomCachLy> listNhomCachLy;
    public Scanner sc;
    public static void main(String[] args) {
        TrungTam trungTam= new TrungTam();
        trungTam.KhoiTao();
        trungTam.InputPhong();
        trungTam.InputNhom();
        trungTam.handle();
        trungTam.dividerRoom();
        //trungTam.NhapDanhSachPhong();
        //trungTam.NhapDanhSachCachLy();

    }
    public void KhoiTao()
    {
        listPhong= new ArrayList<Phong>();
        listNhomCachLy= new ArrayList<NhomCachLy>();
        sc= new Scanner(System.in);
    }
    public void NhapDanhSachPhong()
    {
        int n=0;
        System.out.println("Nhập số phòng của trung tâm");
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.printf("Nhập thông tin phòng thứ %d\n",i+1);
            listPhong.add(NhapThongTinPhong());
        }
    }
    public Phong NhapThongTinPhong()
    {
        Phong p= new Phong();
        System.out.println("Số người tối thiểu: ");
        p.setSoNguoiToiThieu(sc.nextInt());
        System.out.println("Số người tối đa: ");
        p.setSoNguoiToiDa(sc.nextInt());
        System.out.println("Số giường chuyên dụng: ");
        p.setGiuongChuyenDung(sc.nextInt());
        System.out.println("Có giường tầng hay không: ");
        p.setGiuongTang(KiemTra());
        System.out.println("có yên tĩnh hay không");
        p.setYenTinh(KiemTra());
        System.out.println("Chi phí dọn dẹp: ");
        p.setChiPhi(sc.nextDouble());
        return p;
    }
    public boolean KiemTra()
    {
        int a=0;
        System.out.println("\t1: Có\n\t2: Không");
        while (true)
        {
            a=sc.nextInt();
            if(a==1)
                return true;
            else if(a==2)
                return false;
            else
            {
                System.out.println("Bạn nhập sai mời nhập lại");
            }
        }
    }
    public void NhapDanhSachCachLy()
    {
        int n=0;
        System.out.println("Nhập số nhóm cần cách ly của trung tâm");
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.printf("Nhập thông tin nhóm cách ly thứ %d\n",i+1);
            listNhomCachLy.add(NhapThongTinNhomCachLy());
        }
    }
    public void InputPhong()
    {

        Scanner scanner;
        String FileName="H:\\NAM 3\\QUY HOACH TUYEN TINH\\Tuan1\\BTNhom\\Code\\src\\com\\Phong.txt";
        try {
            File text = new File(FileName);
            scanner = new Scanner(text);
            int n=0;
            n=scanner.nextInt();
                for(int i=0;i<n;i++)
                {
                    Phong p= new Phong();
                    scanner.nextLine();
                    p.setName(scanner.nextLine().toString());
                    p.setSoNguoiToiThieu(scanner.nextInt());
                    p.setSoNguoiToiDa(scanner.nextInt());
                    p.setGiuongChuyenDung(scanner.nextInt());
                    p.setGiuongTang(scanner.nextBoolean());
                    p.setYenTinh(scanner.nextBoolean());
                    p.setChiPhi(scanner.nextDouble());
                    listPhong.add(p);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Tập tin không tồn tại!");
            //e.printStackTrace();
        }
    }
    public void InputNhom()
    {

        Scanner scanner;
        String FileName="H:\\NAM 3\\QUY HOACH TUYEN TINH\\Tuan1\\BTNhom\\Code\\src\\com\\NhomCachLy.txt";
        try {
            File text = new File(FileName);
            scanner = new Scanner(text);
            int n=0;
            n=scanner.nextInt();
            for(int i=0;i<n;i++)
            {
                NhomCachLy p= new NhomCachLy();
                scanner.nextLine();
                p.setName(scanner.nextLine());
                p.setSoNguoi(scanner.nextInt());
                p.setGiuongChuyenDung(scanner.nextInt());
                p.setGiuongTang(scanner.nextBoolean());
                p.setYenTinh(scanner.nextBoolean());
                p.setSoNgayCachLy(scanner.nextInt());
                listNhomCachLy.add(p);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Tập tin không tồn tại!");
            //e.printStackTrace();
        }
    }
    public NhomCachLy NhapThongTinNhomCachLy()
    {
        NhomCachLy p= new NhomCachLy();
        System.out.println("Số người cách ly: ");
        p.setSoNguoi(sc.nextInt());
        System.out.println("Số giường chuyên dụng cần sử dụng: ");
        p.setGiuongChuyenDung(sc.nextInt());
        System.out.println("Có giường tầng hay không: ");
        p.setGiuongTang(KiemTra());
        System.out.println("Có cần yên tĩnh hay không: ");
        p.setYenTinh(KiemTra());
        System.out.println("Số ngày cách ly: ");
        p.setSoNgayCachLy(sc.nextInt());
        return p;
    }

    public void handle()
    {
        for(int j=0;j<listNhomCachLy.size();j++)
        {
            for (int i=0;i<listPhong.size();i++) {
                if(Check(listPhong.get(i),listNhomCachLy.get(j)))
                {
                    listNhomCachLy.get(j).setPhongArrayList(listPhong.get(i));
                }
            }
        }
        Collections.sort(listNhomCachLy, new Comparator<NhomCachLy>() {
            @Override public int compare(NhomCachLy p1, NhomCachLy p2) {
                return p1.getPhongArrayList().size()- p2.getPhongArrayList().size();
            }
        });
    }
    public boolean Check(Phong phong, NhomCachLy nhomCachLy)
    {
        if(phong.getSoNguoiToiDa()<nhomCachLy.getSoNguoi())
            return false;
        else if(phong.getGiuongChuyenDung()<nhomCachLy.getGiuongChuyenDung())
            return false;
        else if(phong.isYenTinh()==false&&nhomCachLy.isYenTinh()==true)
            return false;
        else return true;
    }
    public  boolean isAvailable(Phong temp)
    {
        for (Phong element: listPhong) {
            if(element.getName().equals(temp.getName()))
            {
                if(element.isCoNguoi())
                    return true;
            }
        }
        return false;
    }
    public boolean setRoom(Phong temp, NhomCachLy nhomCachLy)
    {
        for (Phong element: listPhong) {
            if(element.getName().equals(temp.getName()))
            {
                if(element.isCoNguoi())
                {
                    element.setCoNguoi(nhomCachLy);
                    return true;
                }
            }
        }
        return false;
    }
    public void dividerRoom()
    {
        for (NhomCachLy element:listNhomCachLy) {
            for (Phong phong:element.getPhongArrayList()) {
                if(setRoom(phong,element))
                    break;
            }
        }
        for (Phong phong:listPhong) {
            if(phong.getNhomCachLy()==null)
                System.out.printf("%s không có nhóm nào ở\n",phong.getName());
            else
                System.out.printf("%s có %s ở\n",phong.getName(),phong.getNhomCachLy().getName());
        }
    }
}
