package pass_generator;


public class Password {
	
	public static void main(String[] str){
		
		String email = "davidgarf2@gmail.com";
		System.out.println("Contraseña generada para "+email+":");
		char[] buff1 = email.toCharArray();
		String emailid = "";
		String emaildomain = "";
		int flag = 0;		
		
		// Es buff2 una variable local del bucle?
		for(char buff2 : buff1){
			if(flag == 1){
				if(buff2 == '.')
					break;
				emaildomain = emaildomain+buff2;
			}
			else if(buff2 == '@'){
				flag = 1;
				continue;
			}
			else{
				emailid = emailid+buff2;
			}
		}
		
		char[] id = emailid.toCharArray();
		char[] domain = emaildomain.toCharArray();
		
		int id_length = emailid.length();
		int domain_length = emaildomain.length();
		
		String password = ""+id[0]+id[1]+domain[domain_length - 2]+domain[domain_length -1]
				+"_"+id_length+"&"+(2*domain_length);
		
		System.out.println(password);
	}
}
