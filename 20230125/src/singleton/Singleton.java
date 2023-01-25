package singleton;

public class Singleton {

	private static Singleton singleton = null;
	// Singleton singleton = new Singleton();
	
	//생성자 private 막음 => 외부에서 Singleton 객체 생성 못함.
	private Singleton() {
		
	}
	//외부에서 Singleton 내부에서 만든 객체 연결하는 메소드.
	public static Singleton getInstance() {
		if(singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
	

}
