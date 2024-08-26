package ch06.score;

// getter/setter : shift + alt + s 누르고 띄고 r
public class ScoreVO { //Value Object
	
	//VO class = 데이터를 저장하려는 목적.
	
	private String hak;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	
	public String getHak() {
		return hak;
	}
	public void setHak(String hak) {
		this.hak = hak;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTot() {
		tot = kor + eng + mat;
		return tot;
	}
	
}
