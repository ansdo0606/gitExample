package ch03;

import java.util.Scanner;

public class JumSoo {

	public static void main(String[] args) {
		String name;
		int java, db, html, jsp ,tot;
		double avg;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("¿Ã∏ß : ");
		name = scan.next();
		System.out.print("Java : ");
		java = scan.nextInt();
		System.out.print("DB : ");
		db = scan.nextInt();
		System.out.print("HTML : ");
		html = scan.nextInt();
		System.out.print("JSP : ");
		jsp = scan.nextInt();
		scan.close();
		
		tot = java + db + html + jsp;
		avg = tot / 3.0;
		
		System.out.println("============================================================");
		System.out.println("¿Ã∏ß\tJava\tDB\tHTML\tJSP\t√—¡°\t∆Ú±’");
		System.out.println("------------------------------------------------------------");
		System.out.println(String.format("%s\t%d\t%d\t%d\t%d\t%d\t%.1f" , name,java,db,html,jsp,tot,avg));
		System.out.println("============================================================");
	}

}
