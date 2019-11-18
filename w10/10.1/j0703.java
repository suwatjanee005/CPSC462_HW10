import java.io.*;
public class j0703 {
  public static void main (String args[]) throws IOException {
    int i = 0;
    String b;
    String[] fields;
    String[] recs = new String[100]; // only 3 records
    FileReader fin = new FileReader("orderdetails.txt");
    BufferedReader bin = new BufferedReader (fin);
    while ((b =  bin.readLine()) != null) {
      recs[i] = b;
      i = i + 1;
    }
    fin.close();
    FileOutputStream fout1 = new FileOutputStream("output1.txt");
    BufferedOutputStream bout1 = new BufferedOutputStream(fout1);
    PrintStream pout1 = new PrintStream(bout1);
    for(int j=0;j<i;j++) {
      fields = recs[j].split(",");
	if(fields[1].equals("5001"))
      pout1.println(fields[0]+","+fields[1]+","+fields[2]+","+fields[3]+","+fields[4]);
    }
    pout1.close();

     FileOutputStream fout2 = new FileOutputStream("output2.txt");
    BufferedOutputStream bout2 = new BufferedOutputStream(fout2);
    PrintStream pout2 = new PrintStream(bout2);
    for(int j=0;j<i;j++) { 
      fields = recs[j].split(",");
	if(fields[1].equals("5002"))
      pout2.println(fields[0]+","+fields[1]+","+fields[2]+","+fields[3]+","+fields[4]);
    }
    pout2.close();

	FileOutputStream fout3 = new FileOutputStream("output3.txt");
    BufferedOutputStream bout3 = new BufferedOutputStream(fout3);
    PrintStream pout3 = new PrintStream(bout3);
    for(int j=0;j<i;j++) { 
      fields = recs[j].split(",");
	if(fields[1].equals("5003"))
      pout3.println(fields[0]+","+fields[1]+","+fields[2]+","+fields[3]+","+fields[4]);
    }
    pout3.close();
  
FileOutputStream fout4 = new FileOutputStream("output4.txt");
    BufferedOutputStream bout4 = new BufferedOutputStream(fout4);
    PrintStream pout4 = new PrintStream(bout4);
    for(int j=0;j<i;j++) { 
      fields = recs[j].split(",");
	if(fields[1].equals("5004"))
      pout4.println(fields[0]+","+fields[1]+","+fields[2]+","+fields[3]+","+fields[4]);
    }
    pout4.close();
  
FileOutputStream fout5 = new FileOutputStream("output5.txt");
    BufferedOutputStream bout5 = new BufferedOutputStream(fout5);
    PrintStream pout5 = new PrintStream(bout5);
    for(int j=0;j<i;j++) { 
      fields = recs[j].split(",");
	if(fields[1].equals("5005"))
      pout5.println(fields[0]+","+fields[1]+","+fields[2]+","+fields[3]+","+fields[4]);
    }
    pout5.close();
  }
}