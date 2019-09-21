package ThirdDay;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.StringTokenizer;

public class StringHandling
{
    public static void main(String[] args) {


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        /*long millis=System.currentTimeMillis();
        java.util.Date date=new java.util.Date(millis);
        System.out.println(date);*/
        //Date d = new Date(System.currentTimeMillis());
        //System.out.print(d);
        LocalDate today = LocalDate.now();                          //Today's date
        LocalDate birthday = LocalDate.of(1994, Month.DECEMBER, 25);  //Birth date

        Period period = Period.between(birthday, today);

//Now access the values as below

        System.out.println(period.getDays());
        System.out.println(period.getMonths());
        System.out.println(period.getYears());





        String pattern = "###,###,##.00";
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.applyLocalizedPattern(pattern);
        int value = 12345678;
        String output = decimalFormat.format(value);
        System.out.println(value + " " + pattern + " " + output);


        String s1;
        s1 = "Hello";
        String s2 = "Hello";
        String s3 = s1;
        String s4 = new String("hello");
        /*if(s1==s2)
        {
            System.out.println("s1==s2");
        }
        else
        {
            System.out.println("s1!= s2");
        }
        if(s2==s3)
        {
            System.out.println("s2==s3");
        }
        else
        {
            System.out.println("s2!= s3");
        }
        if(s1==s4)
        {
            System.out.println("s1==s4");
        }
        else
        {
            System.out.println("s1!==s4");
        }
        if(s1.equals(s4))
        {
            System.out.println("s1==s4");
        }
        else
        {
            System.out.println("s1!==s4");
        }*/
        /*
        System.out.println(s1);
        s1=s1.toLowerCase();
        System.out.println(s1);
        s1=s1.toUpperCase();
        System.out.println(s1);
        s1=s1.concat("   world");
        System.out.println(s1);
        String collegeName = "lambton college in Toronto";
        int s6;
        s6=collegeName.length();
        System.out.println(s6);
        // find the world college
        s6=collegeName.indexOf(collegeName);
        System.out.println(s6);
        // find index of Toronto
        s6=collegeName.indexOf("Toronto");
        System.out.println(s6);
        // to lower case
        collegeName=collegeName.toLowerCase();
        System.out.println(collegeName);
        // upper case
        collegeName=collegeName.toUpperCase();
        System.out.println(collegeName);
        // charcter at index 10
        //collegeName=collegeName.subSequence(10);
        System.out.println(collegeName);

        //Replace Toronto with New York
        //collegeName=collegeName.toLowerCase();
        //collegeName=collegeName.replace("toronto", "New york");
        //System.out.println(collegeName);
        //Find Substring  - "lege in T"
        //Convert to Character Array
        //Concat "265 Yorkland Blvd., North York"
        int a[]={1,2,3,4,5};
        int b[]=new int[]{6,7,8,9,10};
        int c[]=new int[3];
        c[0]=100;
        c[1]=200;
        c[2]=300;
        char []d=collegeName.toCharArray();
        //collegeName.length();
        //d.length
       /* for(int i=0; i < d.length; i++)
        {
            System.out.println(d[i]);


        }*/
      /*char rev[]= new char[d.length];
       int count=0;
       for(int i=d.length-1; i>=0; i--)
        {
            rev[count++]=d[i];
            System.out.println(d[i]);
        }


     String reverseString = new String(rev);

     System.out.println("Reverse String=" + reverseString);
     String[]strings=collegeName.split("");
     StringBuffer stringBuffer= new StringBuffer();
        for(int i=0; i<strings.length; i++)
        {
            String rev1 = strings[i];
            if(i%2==1) {
                rev1 = reverse(rev1);
            }
            stringBuffer.append(rev1);
            stringBuffer.append("");
        }
        System.out.println("args=" + stringBuffer.toString());
        StringTokenizer stringTokenizer = new StringTokenizer(collegeName, " ");
        while(stringTokenizer.hasMoreElements() ) {
            System.out.println("Token : " + stringTokenizer.nextToken());
        }


    }
        static String reverse(String str)
        {
            if(str==null)
            {
                return new String();
            }
            char c[]= str.toCharArray();
            char rev[]=new char[c.length];
            int cnt=0;
            for(int i=c.length-1;i>0;i--)
            {
                rev[cnt++]=c[i];
            }
        return new String(rev);
        }
        String s= String.format("%d %s %s", 10 , "Hello","World");
         //System.out.println(s);
        public class DecimalFormatDemo
        {
            static public void customerFromat(String pattern, double )
        }*/
    }}








