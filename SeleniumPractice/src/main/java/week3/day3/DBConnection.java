package week3.day3;

public class DBConnection implements DatabseConnection {

	public static void main(String[] args) {
		
            DatabseConnection connect = new DBConnection();
            connect.connect();
            connect.executeUpdate();
            connect.disconnect();
            
            
	}

	@Override
	public boolean connect() {
		System.out.println("Connected to Database");
		return true;
	}

	@Override
	public boolean disconnect() {
		System.out.println("Disconnected from Database");  
		return true;
	}

	@Override
	public boolean executeUpdate() {
		System.out.println("Update Successful");
		return true;
	}

}
