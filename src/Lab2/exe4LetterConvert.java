/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;

/**
 *
 * @author SIOW HAN BIN
 */
public class exe4LetterConvert {
    public static void main(String[] args) {
        String word = "Hello";
        String word2 = "";
        
        for(char x:word.toCharArray()){
            if(x == Character.toUpperCase(x)){
                word2 = word2+Character.toLowerCase(x);
            }else{
                word2 = word2+Character.toUpperCase(x);
            }
        }
        System.out.println(word2);
    }
  
}

