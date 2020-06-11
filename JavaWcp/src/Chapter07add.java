
public class Chapter07add {
	public static void main(String[] args) {
		int lunchMoney = 800;
		switch (lunchMoney) {
		case 800:
			System.out.println("チャーシューメンが食べられます");
			break;
		case 600:
			System.out.println("ラーメンが食べられます");
			break;
		default:
			System.out.println("どのラーメンも食べられません");
		}
	}

}
