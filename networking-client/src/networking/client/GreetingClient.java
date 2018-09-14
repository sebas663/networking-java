package networking.client;

public class GreetingClient {
	public static void main(String[] args) {
		String serverName = args[0];
		int port = Integer.parseInt(args[1]);
		ServerProxy proxy = new ServerProxy(serverName,port);
		proxy.send("Hola malditos perros ");
	}
}
