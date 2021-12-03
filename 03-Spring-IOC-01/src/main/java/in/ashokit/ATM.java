package in.ashokit;

public class ATM {

	private IPrinter printer;
	
//	public void setBean(IPrinter printer) {
//		this.printer =  printer; // this is injection through set method (setter-injection)
//	}
	public ATM(IPrinter printer) {
		this.printer = printer;// constructor-injection
	}
	
	public String withdrawal() {
		   printer.print();
		return "Amount withdrawal success";
	}
	
	
}
