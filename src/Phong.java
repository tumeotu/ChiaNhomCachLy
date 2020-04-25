import org.omg.CosNaming.NameHelper;

import java.util.ArrayList;

public class Phong {
    private int SoNguoiToiThieu,SoNguoiToiDa,GiuongChuyenDung;
    private boolean GiuongTang;
    private boolean YenTinh;
    private Double ChiPhi;
    private ArrayList<NhomCachLy> nhomCachLy;
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public boolean isYenTinh() {
        return YenTinh;
    }

    public void setYenTinh(boolean yenTinh) {
        YenTinh = yenTinh;
    }


    public int getSoNguoiToiThieu() {
        return SoNguoiToiThieu;
    }
    public void setSoNguoiToiThieu(int soNguoiToiThieu) {
        SoNguoiToiThieu = soNguoiToiThieu;
    }

    public int getSoNguoiToiDa() {
        return SoNguoiToiDa;
    }

    public void setSoNguoiToiDa(int soNguoiToiDa) {
        SoNguoiToiDa = soNguoiToiDa;
    }

    public int getGiuongChuyenDung() {
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

    public Double getChiPhi() {
        return ChiPhi;
    }

    public void setChiPhi(Double chiPhi) {
        ChiPhi = chiPhi;
    }
    public boolean isCoNguoi() {
        if(nhomCachLy!=null)
            return true;
        return false;
    }
    public void setCoNguoi(NhomCachLy cachly) {
        nhomCachLy.add(cachly);
    }
    public NhomCachLy getNhomCachLy()
    {

        if(nhomCachLy.isEmpty())
            return null;
        return nhomCachLy.get(0);
    }
    public Phong(int soNguoiToiThieu, int soNguoiToiDa, int giuongChuyenDung, boolean giuongTang, Double chiPhi) {
        SoNguoiToiThieu = soNguoiToiThieu;
        SoNguoiToiDa = soNguoiToiDa;
        GiuongChuyenDung = giuongChuyenDung;
        GiuongTang = giuongTang;
        ChiPhi = chiPhi;
        nhomCachLy=new ArrayList<NhomCachLy>();
    }

    public Phong()
    {
        SoNguoiToiThieu = 0;
        SoNguoiToiDa = 0;
        GiuongChuyenDung = 0;
        GiuongTang = true;
        ChiPhi = 0.0;
        nhomCachLy=new ArrayList<NhomCachLy>();
    }
}
