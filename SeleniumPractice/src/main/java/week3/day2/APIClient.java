package week3.day2;

public class APIClient {
	
public String sendRequest(String endpoint)
	{
		System.out.println("Request data is String " + endpoint);
		return "Request Successful for 1 argument!";
	}

public String sendRequest(String endpoint, String requestBody,boolean status)
	{
		System.out.println(endpoint + requestBody  );
		return "Request Successful for 3 arguments ";
	}

public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	   APIClient apic= new APIClient();
	   
	  String endpoint ="https://api.spotify.com/v1/artists/{id}/albums";
	  
	  System.out.println(apic.sendRequest("https://api.spotify.com/v1/artists/{1}/albums"));
	  System.out.println(apic.sendRequest(endpoint,"{id:'1'}",true));
	 

	}

}

