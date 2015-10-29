/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes.tekom;

/**
 *
 * @author Ghassan
 */
public class Lexic {
    String inputan;
//    char[] charArray = inputan.toCharArray();
//    int n = charArray.length;
    String output = "String : ";
    String a ="Operand";
    String b ="Operator";
    String c ="Grouping Symbol";
    String temp="";
    
    Lexic(String inputan){
        this.inputan = inputan+'.';
        initial(0);
    }
    
    public void setInputan(String inputan){
        this.inputan = inputan;
    }
       
    public String getInputan(){
        return inputan;
    }
    private void initial(int awal){
        char z = inputan.charAt(awal);
        
        if (z >= 48 && z <= 57){
            temp+=Character.toString(z);
            Tkn2(++awal);
        }
        else if (z >= 65 && z <=90){
            System.out.println(z);
            Tkn1(++awal);
        }
        else if (z >= 97 && z <=122){
            System.out.println(z);
            Tkn1(++awal);
        }
        
        else if (z == '('){
            System.out.println(output+z);
            Tkn4(++awal);
        }
        else if (z == ')'){
            System.out.println(output+z);
            Tkn5(++awal);
        }
        else if (z == '+'){
            System.out.println(output+z);
            Tkn6(++awal);
        }
        else if (z == '-'){
            System.out.println(output+z);
            Tkn7(++awal);
        }
        else if (z == '*'){
            System.out.println(output+z);
            Tkn8(++awal);
        }
        else if (z == '/'){
            System.out.println(output+z);
            Tkn9(++awal);
        }
        else if (z == '.')
            return ;
    }
    
    private void Tkn1(int awal){ //Variable
        System.out.println("Besaran Lexic : "+a);
        System.out.println("Token Lexic : 1");
        initial(awal);
    }
    private void Tkn2(int awal){ //Integer
        System.out.println(output+temp);
        System.out.println("Besaran Lexic : "+a);
        System.out.println("Token Lexic : 2");
        initial(awal);
    }
    private void Tkn3(int awal){ //Real
        System.out.println("Besaran Lexic : "+a);
        System.out.println("Token Lexic : 3");
        initial(awal);
    }
    private void Tkn4(int awal){ //Kurung Buka
        
        System.out.println("Besaran Lexic : "+c);
        System.out.println("Token Lexic : 4");
        initial(awal);
    }
    private void Tkn5(int awal){ //Kurung Tutup
        System.out.println("Besaran Lexic : "+c);
        System.out.println("Token Lexic : 5");
        initial(awal);
    }
    private void Tkn6(int awal){ //Operator Tambah
        System.out.println("Besaran Lexic : "+b);
        System.out.println("Token Lexic : 6");
        initial(awal);
    }
    private void Tkn7(int awal){ //Operator Kurang
        System.out.println("Besaran Lexic : "+b);
        System.out.println("Token Lexic : 7");
        initial(awal);
    }
    private void Tkn8(int awal){ //Operator Kali
        System.out.println("Besaran Lexic : "+b);
        System.out.println("Token Lexic : 8");
        initial(awal);
    }
    private void Tkn9(int awal){ //Operator Bagi
        System.out.println("Token Lexic : 9");
        initial(awal);
    }
}