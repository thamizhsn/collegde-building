package org.firstfloor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Gsection {
	public static void main(String[] args) {
	 Map<Integer,Fsection> l = new HashMap<>();
	  
	 Fsection f = new Fsection();
	 f.setEmpId(2213);
	 f.setName("rajesh");
	 f.setPhoneno(8778669565l);
	 f.setEmail("rajesh@gmail.com");
	 
	 Fsection f1 = new Fsection();
	 f1.setEmpId(2214);
	 f1.setName("suresh");
	 f1.setPhoneno(8083432105l);
	 f1.setEmail("suresh464@gmail.com");
	 
	 Fsection f2 = new Fsection();
	 f2.setEmpId(2215);
	 f2.setName("ramesh");
	 f2.setPhoneno(9098874560l);
	 f2.setEmail("rami55544@gmail.com");
	 
	 l.put(0,f);
	 l.put(1,f1);
	 l.put(2,f2);
	 Set<Entry<Integer,Fsection>>a = l.entrySet();
	  for(Entry<Integer,Fsection> x: a){
		  System.out.println(x.getValue().getEmpId());
		  System.out.println(x.getValue().getName());
		  System.out.println(x.getValue().getPhoneno());
		  System.out.println(x.getValue().getEmail());
	}

}}
