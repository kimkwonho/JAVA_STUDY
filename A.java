package sec01.exam01;

class A {
     A(){ System.out.println("A 객체가 생성됨.");}
	
	
	
	class B{
		B(){System.out.println("B 객체가 생성됨.");}
			
		
		
		int field1;
		// static field2; 정적 필드 생성 불가. 인스턴스 멤버 클래스이기 때문에
		void method1() {}
		// static void method2(); 정적 메소드 생성 불가. 인스턴스 멤버 클래스이기 때문에
	}
	static class C {
			C(){System.out.println("C 객체가 생성됨.");}
			
			
			
			
			
			int field1;
			static int field2;
			void method1() { }
			static void method2() { }
			
		}
		
		void method() {
			class D{
				D(){System.out.println("D 객체가 생성됨.");}
			
				int field1;
				//static int field2; 정적 필드 생성 불가. 로컬클래스 이기 때문에
				void method1() {}
				//static void method2(){} 정적 메소드 생성 불가. 로컬클래스 이기 때문에
			}
		
			D d = new D();
			d.field1 = 3;
			d.method1();
		
			
		}
	




}
