package kr.ac.kookmin.exception.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 Makes numbered.txt the same as original.txt, but with each line numbered.
*/
public class AddLineNumber
{
   public static void main(String[] args)
   {
       String path = AddLineNumber.class.getResource("").getPath();
       System.out.println(path);

      try
      {
         BufferedReader inputStream = 
               new BufferedReader(new FileReader("c:\\original.txt"));
         PrintWriter outputStream = 
               new PrintWriter(new FileOutputStream("c:\\numbered.txt"));
         String temp=null;
         int i=1;
         while((temp=inputStream.readLine())!=null){
        	 outputStream.write(i+" "+temp);
        	 outputStream.write("\r\n");
        	 i++;
         }
          /**
           구현하시오. 
          **/
         inputStream.close( );
         outputStream.close( );
      }catch(IOException e){
    	  System.out.println("IOException");
      }
      
      /** catch() 구문 작성하시오 **/

   }
}