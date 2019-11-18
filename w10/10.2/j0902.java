import java.io.*;
public class j0902 {
  public static void main (String args[]) throws IOException {
    int i = 0,t1,t2;
    String b,categoryid;
    String[] fields;
    String[] recs1 = new String[30];
    String[] recs2 = new String[30];
    FileReader fin = new FileReader("products.txt");
    BufferedReader bin = new BufferedReader (fin);
    while ((b =  bin.readLine()) != null) {
      recs1[i] = b;
      i = i + 1;
    }
    fin.close();
    t1 = i;
    i = 0;

    FileReader fin2 = new FileReader("categories.txt");
    BufferedReader bin2 = new BufferedReader (fin2);
    while ((b =  bin2.readLine()) != null) {
      recs2[i] = b;

      i = i + 1;
    }
    fin2.close();
    t2 = i;

    for(int j=0;j<t1;j++) {
      fields = recs1[j].split(",");
      System.out.println("Show Products"+" = "+fields[0] +" , "+ fields[1] +" , "+  fields[2]+" , "+  fields[3]+" , "+  fields[4]);
     categoryid = fields[3];
      for(int p=0;p<t2;p++) {
        fields = recs2[p].split(",");
        if (fields[0].equals(categoryid)) {
          System.out.println("Show categories"+" = "+fields[2]);

        }
      }
    }
  }
}
