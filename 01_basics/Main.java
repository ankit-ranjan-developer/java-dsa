import java.util.Scanner;

class Pratice {

    public void print() {
        System.out.print("Hello World!");
    }

    public void comments() {
        // This is single line comment

        /*
         * This
         * is
         * a
         * multiline
         * comment
         */
    }

    public void dataTypes() {
        byte b = 100;
        short s = 1600;
        int i = 6778789;
        long l = 867856346;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);

        char c = 'a';
        System.out.println(c);

        float f = 123;
        double d = 1234.89977;

        System.out.println(f);
        System.out.println(d);

        boolean bool = false;
        System.out.println(bool);
    }
}

class Operator{
    public void arithematicOperator(int num1, int num2) {
        char[] ch = { '+', '-', '*', '/', '%' };

        int result;

        for (char c : ch) {
            switch (c) {
                case '+':
                    result = num1 + num2;
                    System.out.println(result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println(result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println(result);
                    break;
                case '/':
                    result = num1 / num2;
                    System.out.println(result);
                    break;
                case '%':
                    result = num1 % num2;
                    System.out.println(result);
                    break;
            }
        }
    }

    public void unaryOperator(){
        int pnum = 89;
        int nnum = -100;

        System.out.println(+pnum);
        System.out.println(-pnum);
        System.out.println(+nnum);
        System.out.println(-nnum);

        // ++, -- 

        int num1 = 6;
        int num2 = num1++;
        System.out.println("---- post-increment ----");
        System.out.println(num1);
        System.out.println(num2);

        int num3 = 6;
        int num4 = ++num3;
        System.out.println("---- pre-increment ----");
        System.out.println(num3);
        System.out.println(num4);

        // !

        boolean bool = false; 
        System.out.println(!bool);
        System.out.println(!!bool);
    }

    public void relationalOperator(){
        int num1 = 6;
        int num2 = 7;

        System.out.println(num1 < num2);
        System.out.println(num1 > num2);
        System.out.println(num1 <= num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 == num2);
        System.out.println(num1 != num2);
    }

    public void logicalOperator() {
        /*
        AND - && 
        OR - ||
        */

        boolean t1 = true;
        boolean t2 = true;
        boolean f1 = false;
        boolean f2 = false;
        
        System.out.println("--- And ---");
        System.out.println(t1 && t2);
        System.out.println(t1 && f1);
        System.out.println(f1 && f2);

        System.out.println("--- Or ---");
        System.out.println(t1 || t2);
        System.out.println(t1 || f1);
        System.out.println(f1 || f2);
    }

    public void assignmentOperator() {
        int num = 2;

        int result = 8;
        result += num;
        System.out.println(result);

        result = 8;
        result -= num;
        System.out.println(result);

        result = 8;
        result *= num;
        System.out.println(result);

        result = 8;
        result /= num;
        System.out.println(result);

        result = 8;
        result %= num;
        System.out.println(result);
    }

    public void ternaryOperator(){

        // (condition) ? true : false; 

        int num1 = 9;
        int num2 = 10;
        int max = (num1 > num2) ? num1 : num2;
        System.out.println(max);
    }
}

class Stringclass {
    public void stringmethod(){

        // Concatenation.
        String fname = "Ankit";
        String lname = "Ranjan";
        String fullname = fname + " " + lname;
        System.out.println(fullname);

        // Default methods. 
        String str = "character array";
        System.out.println(str.charAt(7));
        System.out.println(str.substring(7));
        System.out.println(str.substring(7,11));
        System.out.println(fname.equals(lname));
        System.out.println(str.length());
        
        // Immutability 
        
        System.out.println("------ Immutable ------");

        String name = "ANKIT";
        String fcheck = "ANKIT";
        String scheck = "ANKIT";

        String lastName = "RANJAN";
        name += lastName;
        System.out.println(name);

        System.out.println(name == fcheck);
        System.out.print(scheck == fcheck);
    }
}

class TakeInput {
    public void takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("---- TAKE INPUT ----");
        int integerInput = sc.nextInt();
        float floatInput = sc.nextFloat();
        double doubleInput = sc.nextDouble();
        String stringInput = sc.nextLine();
        String wordInput = sc.next();
        
        System.out.println("---- PRINT OUTPUT ----");
        System.out.println(integerInput);
        System.out.println(floatInput);
        System.out.println(doubleInput);
        System.out.println(stringInput);
        System.out.println(wordInput);

        sc.close();
    }
}

class TypeCast {
    public void typeCasting() {

        // Implicit :- (low precision to higher precision only.)
        int num1 = 10;
        double changeNum = num1; 
        System.out.println(changeNum);

        // double num2 = 8.9;
        // int changedNum = num2;
        // /*
        // Type mismatch: cannot convert from double to intJava(16777233)
        // double num2 - TypeCast.typeCasting()
        // */
        // System.out.println(changeNum);

        // Explicit - both direction (low to high and high to low)
        double num3 = 8.9;
        int changedtypedNum = (int)num3;
        System.out.println(changedtypedNum);
    }
}

class Constants {
    public void constantdeclare() {
        final int day = 7;

        // day += 1;
        /*
        The final local variable day cannot be assigned. It must be blank and not using a compound assignmentJava(536870970)
        int day - Constants.constantdeclare()
        */

        System.out.println(day);
    }
}

class ArrayPractice {
    public void arrayPractice() {
        // Declaration 

        int[] arr = new int[5];
        
        // INTILIZATION 

        // 1. direct 
        arr[0] = 7;

        // 2. loops
        
        System.out.println("--- Loop input---");

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        // OUTPUT 

        System.out.println("--- loop output ---");
        
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
        System.out.println("--- forEach output ---");
        for(int val : arr) {
            System.out.println(val);
        }

        // 2D ARRAY 

        System.out.println("--- 2D ARRAY ---");

        // int [][] arr1 = new int[1][2];
        int[][] arr2 = {{1,2}, {3,4}};

        for(int i = 0; i < arr2.length; i++) {
            for(int j = 0; j <= 1; j++) {
                System.out.println(arr2[i][j]);
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Java!");

        Pratice p = new Pratice();
        p.print();
        p.comments();
        p.dataTypes();

        Operator op = new Operator();
        op.arithematicOperator(1, 6);
        op.unaryOperator();
        op.relationalOperator();
        op.logicalOperator();
        op.ternaryOperator();

        Stringclass s = new Stringclass();
        s.stringmethod();

        TakeInput tp = new TakeInput();
        tp.takeInput();

        TypeCast tc = new TypeCast();
        tc.typeCasting();

        Constants c = new Constants();
        c.constantdeclare();

        ArrayPractice ar = new ArrayPractice();
        ar.arrayPractice();
        
    }
}
