package sec02.exam03;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	//�ʵ� �ʱⰪ���� ����
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void OnClick() {
			System.out.println("��ȭ�� �̴ϴ�.");
			
		}
	};
	
	Window(){
		button1.setOnClickListener(listener);  //�Ű������� �ʵ� ����
		button2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void OnClick() {
				System.out.println("�޼����� �����ϴ�.");				
			}
		});
	}

}
