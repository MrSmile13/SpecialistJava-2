
import java.rmi.RemoteException;

import ru.specialist.service.*;

public class Program {

	public static void main(String[] args) throws RemoteException {
		MyService proxy = new MyServiceProxy();
		String result = proxy.getServerTime();
		System.out.println(result);
				

	}

}
