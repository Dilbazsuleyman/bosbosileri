package com.company;

import javax.xml.namespace.QName;

public class Main {

    public static void main(String[] args) {

    }
}
class Bank {
    public int modelYear ;
    public int serialnumber ;
    public String modelName ;
public boolean trustworthiness;
public Bank(){
    modelYear=0;
    serialnumber=0;
    modelName="Unknown Bank";
    Bank bank =new Bank();
    System.out.println(bank.modelName+bank.serialnumber);
    System.out.println("bankname :"+modelName);
    System.out.println("bankname :"+serialnumber);
    System.out.println("bankname :"+modelYear);

}

public Bank(boolean t){
    this(2019,10,"Bank of America");
    trustworthiness=t ;
}


    public  Bank(int year,int num ,String name) {

        modelYear = year;
        serialnumber = num;
        modelName = name;

    }

    public String getAttributes() {
        return "Bank name:"+modelYear+"\n"
                +"Bank name:"+serialnumber+"\n"
                +"Serial Number"+serialnumber+"\n";


    }

}


