import java.sql.Struct;
import java.util.ArrayList;

public class NhomCachLy {
    private int SoNguoi,SoNgayCachLy,GiuongChuyenDung;
    private boolean YenTinh,GiuongTang;
    private ArrayList<Phong> phongArrayList;
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getGiuongChuyenDung() {
        return GiuongChuyenDung;
    }
    public ArrayList<Phong> getPhongArrayList() {
        return phongArrayList;
    }
    public void setPhongArrayList(ArrayList<Phong> phongArrayList) {
        this.phongArrayList = phongArrayList;
    }
    public void setPhongArrayList(Phong phongArrayList) {
        this.phongArrayList.add(phongArrayList);
    }

    public int getSoNguoi() {
        return SoNguoi;
    }

    public void setSoNguoi(int soNguoi) {
        SoNguoi = soNguoi;
    }

    public int getSoNgayCachLy() {
        return SoNgayCachLy;
    }

    public void setSoNgayCachLy(int soNgayCachLy) {
        SoNgayCachLy = soNgayCachLy;
    }

    public boolean isYenTinh() {
        return YenTinh;
    }

    public void setYenTinh(boolean yenTinh) {
        YenTinh = yenTinh;
    }

    public int isGiuongChuyenDung() {
        return GiuongChuyenDung;
    }

    public void setGiuongChuyenDung(int giuongChuyenDung) {
        GiuongChuyenDung = giuongChuyenDung;
    }

    public boolean getGiuongTang() {
        return GiuongTang;
    }

    public void setGiuongTang(boolean giuongTang) {
        GiuongTang = giuongTang;
    }
    public NhomCachLy(int soNguoi, int soNgayCachLy, boolean yenTinh, int giuongChuyenDung, boolean giuongTang) {
        SoNguoi = soNguoi;
        SoNgayCachLy = soNgayCachLy;
        YenTinh = yenTinh;
        GiuongChuyenDung = giuongChuyenDung;
        GiuongTang = giuongTang;
    }
    public NhomCachLy()
    {
        SoNguoi = 0;
        SoNgayCachLy = 0;
        YenTinh = true;
        GiuongChuyenDung = 0;
        GiuongTang = true;
        phongArrayList= new ArrayList<Phong>();
    }


}
