package huyenTran_23664731;

public class PhongLT extends PhongHoc{
	private boolean cosMayChieu;
	

	public PhongLT(String maPhong, String dayNha, double dienTich, int soBongDen, boolean cosMayChieu)
			throws IllegalAccessException {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.cosMayChieu = cosMayChieu;
	}
	
    public PhongLT() throws IllegalAccessException {
		super();
		this.cosMayChieu = false;
	}
	

    public boolean isCosMayChieu() {
		return cosMayChieu;
	}

	public void setCosMayChieu(boolean cosMayChieu) {
		this.cosMayChieu = cosMayChieu;
	}


@Override
	public boolean getDatChuan() {
		return (duSang()&& cosMayChieu);
	}
@Override
public String toString() {
	String mayChieu= cosMayChieu?"Co may chieu":" khong co may chieu";
			return super.toString()+ String.format("%10s|", mayChieu);
}
	

}
