import java.io.Serializable;
public class User implements Serializable {
	private String id; //���̵�
	private int score;	//����
	public User() {
		score = 0;
		id = "";
	}
	public User(int theNumber, String theLetter) {
		score = theNumber;
		id = theLetter;
	}
	public String toString() {
		return "id : " + score
				+ " score : " + id;
	}
}
