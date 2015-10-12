package kr.ac.kookmin.exception.intro;

import java.io.*;


public class AAA {
	public void readFile(){
		String path=AAA.class.getResource("").getPath();
		BufferedReader br=null;
		InputStreamReader isr=null;
		FileInputStream fis = null;
		
		File file = new File("c:\\a.txt");
		
		String temp="";
		String content="";
		
		try{
			fis = new FileInputStream(file);
			isr = new InputStreamReader(fis,"UTF-8");
			br = new BufferedReader(isr);
			
			while((temp=br.readLine())!=null){
				content += temp +"\n";
			}
			System.out.println(content);
		}
		catch(IOException e){
			System.out.println("IOException\n");
		}finally{
			close(br);
		}
	}
	
	public void close(BufferedReader temp){
		try{
			temp.close();
		}catch (Exception e){
			System.out.println("EXCEPTION");
		}
	}

}
