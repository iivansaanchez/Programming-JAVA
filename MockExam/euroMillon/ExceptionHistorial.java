package euroMillon;

import java.beans.ExceptionListener;

public class ExceptionHistorial extends Exception implements ExceptionListener {

	public ExceptionHistorial() {
		// TODO Auto-generated constructor stub
	}

	public ExceptionHistorial(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ExceptionHistorial(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void exceptionThrown(Exception e) {
		// TODO Auto-generated method stub
		
	}

	

}
