import java.io.Serializable;
public class User implements Serializable {
	private String id; //���̵�
	private double score;	//����
	public User() {
		score = 0.0;
		id = "";
	}
	public User(double theNumber, String theLetter) {
		score = theNumber;
		id = theLetter;
	}
	public String toString() {
		return "id : " + score
				+ " score : " + id;
	}
}
