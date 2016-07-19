package annexstuff;

public class Test_g_Stuff {

	//Teste si un string à pour extension *grammar
	public static boolean isGrammar(String sub) {
		// TODO Auto-generated method stub
		String extension = sub.substring(sub.lastIndexOf(".") + 1);
		if (extension.length()==7) return true;
		else return false;
	}
  
	//Teste si un string à pour extension *graph
	public static boolean isGraph(String xxx) {
		// TODO Auto-generated method stub
		String extension = xxx.substring(xxx.lastIndexOf(".") +1);
		if (extension.length()==5) return true;
		else return false;
	}
}
