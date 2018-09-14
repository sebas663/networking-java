package networking.client;

public class ServerProxy {
	private String serverName;
	private int port;
	private Server server;

	public ServerProxy(String serverName, int port) {
		super();
		this.serverName = serverName;
		this.port = port;
	}

	public void createServer() {
		server = new Server(serverName, port);
		server.createServer();
	}
	
	public void send(String mesagge) {
		createServer();
		server.send(mesagge);
	}
}
