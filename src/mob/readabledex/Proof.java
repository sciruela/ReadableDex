package mob.readabledex;

public class Proof {
	private String a,b,c,d;
	
	public String Ifs() {
		if(a!=null){
			return a;
		}else{
			if(b!=null){
				return b;
			}else{
				if(c!=null){
					return c;
				}else{if(d!=null){
					return d;
				}else{
					return "None";
				}
			}
		}
	}
	}
}
