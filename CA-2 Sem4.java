/*
Q. Create an INterface Mystring with abstract method boolean isPalindrome(String Str) and two more interface Vowel and Consonants. Vowel contains a default method int count(String str) which return the number of vowels in the string and the other interface Consonant contains a Default method int count2(string str) which returns the number of consonants in the string. Class Demo inherits the Mystring,vowel,Consonant and also contains a inner class Demo2 with a method getstring() to get the string from the user. In main print out whether the given string is palindrome, number of vowels and consonants using obove methods
*/

import java.util.Scanner;
interface Mystring{
    boolean isPalindrome(String stri);
}
interface Vowel{

    default int count(String st){
        int amount=0;
        st=st.toLowerCase();               //To make char same as to compare easily
        char [] array=st.toCharArray();
        for(int i=0;i<array.length;i++){
            if(array[i]=='a' || array[i]=='e' || array[i]=='i' || array[i]=='o' || array[i]=='u')
                ++amount;
        }return amount;
    }
}
interface Consonants{

    default int count2(String st){
        int amount=0;
        st=st.toLowerCase();
        char [] array=st.toCharArray();
        for(int i=0;i<array.length;i++){
            if(array[i]!='a' & array[i]!='e' & array[i]!='i' & array[i]!='o' & array[i]!='u')
                ++amount;

        }return amount;
    }
}
class Demo implements Mystring,Vowel,Consonants{
    String str;

    public boolean isPalindrome(String stri)
        {  StringBuilder x=new StringBuilder(stri);    //String to Stringbuilder
        x=x.reverse();                         //reversing String
        String naya=x.toString();               //toString Method to return x's object as String
            if(str.equals(naya)){
            return true;}
            else{
                return false;
        }}

    class Demo2{

        void readstring(){
            Scanner scan=new Scanner(System.in);
            str=scan.nextLine();

        }
    }
}

class Main{
    public static void main(String [] args){
        Demo obj=new Demo();
        Demo.Demo2 obj2=obj.new Demo2();
        obj2.readstring();
        System.out.println("Is the String Palindrome: "+obj.isPalindrome(obj.str));
        System.out.println("Vowels are: "+obj.count(obj.str));
        System.out.println("Consonants are: "+obj.count2(obj.str));


    }

}
