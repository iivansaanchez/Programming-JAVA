package chatInstituto;

import java.util.Comparator;

public class NombreComparator implements Comparator<Mensaje>{

	@Override
	public int compare(Mensaje o1, Mensaje o2) {
	int res = 0;
		
		try {
			if(o1!= null && o2 != null) {
				res=o1.emisor.nombre.compareTo(o2.emisor.nombre);
			}else if(o1==null) {
				res=-1;
			}else if (o2==null){
				res=1;
			}
		}catch (Exception e) {
			System.out.println("Error persona nula.");
		}
		return res;
	}

}
