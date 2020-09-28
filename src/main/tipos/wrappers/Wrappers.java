package one.digitalinnovation.tipos.wrappers;

public class Wrappers {
    public static void main(String[] args) {
        /* Auto-boxing 
		mesmas características dos primitivos, porém em objetos, e assim podemos usar null */

        Byte b = 127;   //byte, classe Byte
        Byte b2 = -128;
        Byte nullByte = null;

        Character c = 'A'; //char, classe Character
        Character c2 = 15;

        Short s = 32767; //short, classe Short
        Short s2 = -32768;

        Integer i = 2147483647;  //int, classe Integer
        Integer i2 = -2147483648;

        Long l = 9223372036854775807L; //long, classe Long
        Long l2 = -9223372036854775808L;

        Float f = 65f; //float, classe Float
        Float f2 = 65.0f;
        Float f3 = -0.5f;

        Double d = 1024.99;  //Double, classe Double
        Double d2 = 10.2456;

        Boolean bo = true;  //boolean, classe Boolean
        Boolean bo2 = false;

        Boolean bo3 = Boolean.getBoolean("false");  //OK
        Boolean bo4 = Boolean.valueOf("true");   //OK       
    }
}