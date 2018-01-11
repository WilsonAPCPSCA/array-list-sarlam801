import java.util.ArrayList;
public class emperorCast {

	public static void main(String[] args) {
		ArrayList<String>emperorCast=new ArrayList<String>();
		emperorCast.add("Kuzco");
		emperorCast.add("Pacha");
		emperorCast.add("Yzma");
		emperorCast.add("Kronk");
		System.out.print(emperorCast);
		emperorCast.remove(1);
		emperorCast.add(2, "Chaca");
		emperorCast.add(3, "Tipo");
		emperorCast.add(5, "Bucky");
		emperorCast.add(6, "Pacha");
		System.out.print(emperorCast);
		
		
	}

}
