I have used *DEDEXER tool to read the binary code of Android (Dex files) on the fly and on-device.

*http://dedexer.sourceforge.net/

I have read a class and I have analyzed this code counting how many if's there are in this class.

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
