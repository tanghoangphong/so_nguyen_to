package so_nguyen_to;

public class so_nguyen_to aa{
	static String result;
	
	 static check M = new check();
	public String getResult() {
		return result;
	}
	public void setResult(int N) {
		 
	     
	      if(M.kiemtrasonguyento(N)==0)
	      {
	    	  result="False";	    	
	      }
	      else
	      {
	    	  result="True";	    	 
	      }
	}
}
