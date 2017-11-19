
public class HelloWorld {

	String helloString;
	
	
	public HelloWorld(String helloString) {
		super();
		setHelloString(helloString);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld h = new HelloWorld("testing");
		
		System.out.println("Hello World!" + h.getHelloString());
		
	}

	public String getHelloString() {
		return helloString;
	}

	public void setHelloString(String helloString) {
		this.helloString = helloString;
	}

}
