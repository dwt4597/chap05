package chap05;

public class StringEquealsExample {

	public static void main(String[] args) {
		String strVar1 = "���ؼ�";
		String strVar2 = "���ؼ�";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1�� strVar2�� ������ ����");
		} else {
			System.out.println("strVar1�� strVar2�� ������ xxxx");
		}
		
		String strVar3 = new String("���ؼ�");
		String strVar4 = new String("���ؼ�");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3�� strVar4�� ������ ����");
		} else {
			System.out.println("strVar3�� strVar4�� ������ xxxx");
		}
		
	
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3�� strVar4�� ���ڿ��� ����");
		}
		}
	}
	


