package sec02.exam03;

public class Button {
	OnClickListener listener; //�������̽� Ÿ�� �ʵ�
	
	void setOnClickListener(OnClickListener listener)  //�Ű������� ������
	{
		this.listener = listener;
	}
	void touch() {                                   //���� ��ü�� onClick() �޼ҵ� ȣ��
		listener.OnClick();
	}
	static interface OnClickListener{                //��ø �������̽�
		void OnClick();
	}

}
