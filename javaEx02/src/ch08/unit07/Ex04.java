package ch08.unit07;

public class Ex04 {

	public static void main(String[] args) {
		Button.OnClickListener listener = new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("와 누른데");
			}
		};
		listener.onClick();
	}

}

class Button {
	public interface OnClickListener {
		public void onClick();
	}
}


