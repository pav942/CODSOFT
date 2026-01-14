import java.util.Scanner;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class currency {
public static double rate(String a,String b){
    try{
        URL c=new URL("https://api.exchangerate-api.com/v4/latest/"+a);
        HttpURLConnection d=(HttpURLConnection)c.openConnection();
        d.setRequestMethod("GET");
        BufferedReader e=new BufferedReader(new InputStreamReader(d.getInputStream()));
        String f;
        StringBuilder g=new StringBuilder();
        while((f=e.readLine())!=null){
            g.append(f);
        }
        String h=g.toString();
        int i=h.indexOf("\""+b+"\":");
        int j=i+b.length()+3;
        int k=h.indexOf(",",j);
        return Double.parseDouble(h.substring(j,k));
    } catch (Exception l){
        System.out.println("error");
        return -1;
    }
}
public static String symbol(String m){
    switch (m) {
        case "INR":
            return "₹";
        case "USD":
            return "$";
        case "EUR":
            return "€";
        case "GBP":
            return "£";
        case "JPY":
            return "¥";
        case "AUD":
            return "A$";
        case "CAD":
            return "C$";
        default:
            return m+" ";
    }
}
public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter base currency: ");
    String x=s.next().toUpperCase();
    System.out.println("enter target currency: ");
    String y=s.next().toUpperCase();
    System.out.println("enter amount: ");
    double z=s.nextDouble();
    double t=rate(x,y);
    if(t==-1){
        System.out.println("currency conversion is failed");
    } else{
        double v=z*t;
        String o=symbol(y);
        System.out.println("\nconverted amount: "+o+v);
        }
}
}
