//Declare a array name percentage with 5 float value also initilize it.
public class Declare_arr 
{
   public static void main(String[] args)
   {
    float[] percentage = {11.2f, 23.6f, 65.8f, 45.7f, 58.5f};

    //printing values
    for(int i = 0; i < percentage.length; i++)
    {
        System.out.println("Percentage[" + i + "] = " + percentage[i]);
     }
   }
}


/*
Java type
1. Primitive type (the value it self)
- stores the actual simple value directly in memory(usually on the stack)
 - Byte:
   - size in bytes: 1
   - size in bits: 8
 - Short:
   - size in bytes: 2
   - size in bits: 16
 - Int:
   - size in bytes: 4
   - size in bits: 32
 - Long:
   - size in bytes: 8
   - size in bits: 64
 - Float
   - size in bytes: 4
   - size in bits: 32
 - Double:
   - size in bytes: 8
   - size in bits: 64
 - Char:
   - size in bytes: 2
   - size in bits: 16
 - Boolean:
   - size in bytes: 1
   - size in bits: 8 approx
2. Nonprimitive type/ Reference (the map to the value)
- it stores memory address(reference) of an object, rather then actual value
  - Class: user-defined or built-in
  - Interfaces: blueprint of a class
  - Arrays: collection of same type elements
  - String: special predefined class
  - Enums: fixed set of constant
  - Wrapper classes: object form of primitive types.((full word like int no, Integer))
  ( the above are main categories)
   */ 