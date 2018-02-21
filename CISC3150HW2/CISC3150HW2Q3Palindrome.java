//REDWAN AHMED
//CISC3150 HomeWork 2
//Question 3 Palindrome 

import java.util.*;
public class CISC3150HW2Q3Palindrome {

    public static void main(String args[]){
        String example = "madamimadam";
        System.out.println("is " + example + " a palindrome? " + palindrome(example));
    }

    public static boolean palindrome(String word){
        for(int i = 0; i < word.length()/2; i++){
            if(word.charAt(i) != word.charAt(word.length()-1-i))
                return false;
        }
        return true;
    }
}