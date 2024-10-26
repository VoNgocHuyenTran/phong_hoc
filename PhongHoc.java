package huyenTran_23664731;

import java.util.Objects;

public abstract class PhongHoc {
	protected String maPhong, dayNha;
	protected double dienTich;
	protected int soBongDen;
	public PhongHoc(String maPhong, String dayNha, double dienTich, int soBongDen) throws IllegalAccessException {
		setMaPhong(maPhong);
		setDayNha(dayNha);
		setDienTich(dienTich);
		setSoBongDen(soBongDen);
	}
	public PhongHoc() throws IllegalAccessException {
		this("", "",0.0,0);
	}
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) throws IllegalAccessException {
		if(maPhong == null)
			throw new IllegalAccessException("Ma phong khong duoc de trong");
		this.maPhong = maPhong;
	}
	public String getDayNha() {
		return dayNha;
	}
	public void setDayNha(String dayNha) throws IllegalAccessException {
		if(dayNha== null)
			throw new IllegalAccessException(" Day nha khong duoc de trong");
		this.dayNha = dayNha;
	}
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) throws IllegalAccessException {
		if(dienTich<=0)
			throw new IllegalAccessException("Dien tich phai lon hon 0");
		this.dienTich = dienTich;
	}
	public int getSoBongDen() {
		return soBongDen;
	}
	public void setSoBongDen(int soBongDen) throws IllegalAccessException {
		if(soBongDen<=0)
			throw new IllegalAccessException(" So bong den phai lon hon 0");
		this.soBongDen = soBongDen;
	}
	public boolean duSang() {
		return (getDienTich()/ getSoBongDen()<=10);
	}
	public abstract boolean getDatChuan();
	@Override
	public String toString() {
		String s="";
		s+= String.format("|%10s|%10s|%10s|%10s|", getMaPhong(), getDayNha(), getDienTich(), getSoBongDen());
		return s;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maPhong);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhongHoc other = (PhongHoc) obj;
		return Objects.equals(maPhong, other.maPhong);
	}
	
	
	

}
