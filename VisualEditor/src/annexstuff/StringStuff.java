package annexstuff;


public class StringStuff {
	
	//retourne le nom du graphe/ Grammar+ celui du project
	public static String Nameg(String a) {
		// TODO Auto-generated method stub
	      char[] b = a.toCharArray();
	      int i = a.lastIndexOf("/");
	      int j = i-1; 
	      int val = -1;
	       boolean tr = true;
		while (tr )
	       {
	     	  if (b[j]=='/') 
	     	  {
	     		  tr = false;
	     		  val = j;
	     	  }
	     	  j--;
	       }
	       return  a.substring(j + 2);
	}
	public static String Delete_last(String str) {
	    if (str != null && str.length() > 0 ) {
	      str = str.substring(0, str.length()-1);
	    }
	    return str;
	}

	
	

	
}
