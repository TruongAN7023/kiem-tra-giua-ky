package advance;

public class studen extends Person {
	protected double toan;
	protected double ly;
	protected double hoa;

	public studen(String name, int age, double toan, double ly, double hoa) {

		super(name, age);
		this.toan = toan;
		this.ly = ly;
		this.hoa = hoa;
	}

	// Getter và setter cho toan, ly và hoa
	public double getToan() {
		return toan;
	}

	public void setToan(double toan) {
		this.toan = toan;
	}

	public double getLy() {
		return ly;
	}

	public void setLy(double ly) {
		this.ly = ly;
	}

	public double getHoa() {
		return hoa;
	}

	public void setHoa(double hoa) {
		this.hoa = hoa;
	}

	// Phương thức tính điểm trung bình
	public double diemTrungBinh() {
		return (toan + ly + hoa) / 3;
	}

}
