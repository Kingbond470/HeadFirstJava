/*
Mirror Image
    Print the mirror image of the given lowercase string ayzb should become zbay
    Note: mirror image does not mean reverse (The mirror image of a is z, b is y, c is x ...)

Dec = ASCII value of character

Dec  Char     Dec  Char     Dec  Char
---------     ---------     ----------
 32  SPACE     64  @         96  `
 33  !         65  A         97  a
 34  "         66  B         98  b
 35  #         67  C         99  c
 36  $         68  D        100  d
 37  %         69  E        101  e
 38  &         70  F        102  f
 39  '         71  G        103  g
 40  (         72  H        104  h
 41  )         73  I        105  i
 42  *         74  J        106  j
 43  +         75  K        107  k
 44  ,         76  L        108  l
 45  -         77  M        109  m
 46  .         78  N        110  n
 47  /         79  O        111  o
 48  0         80  P        112  p
 49  1         81  Q        113  q
 50  2         82  R        114  r
 51  3         83  S        115  s
 52  4         84  T        116  t
 53  5         85  U        117  u
 54  6         86  V        118  v
 55  7         87  W        119  w
 56  8         88  X        120  x
 57  9         89  Y        121  y
 58  :         90  Z        122  z
 59  ;         91  [        123  {
 60  <         92  \        124  |
 61  =         93  ]        125  }
 62  >         94  ^        126  ~
 63  ?         95  _        127  DEL

*/

//Program-1
import java.util.Scanner;

public class MirrorImage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        mirror(str);
    }
    public static void mirror(String str) {
        //ASCII -- 65(A) to 90(Z)  &&  97(a) to 122(z)
        //char[] ch = str.toCharArray();
        String strRevSmall = "zyxwvutsrqponmlkjihgfedcba";
        String strRevCaps = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
        String result = "";
        for(int i=0; i<str.length(); i++) {
            char a = str.charAt(i);
            int n = (int)a;//    --------------------- int n --> will store the ASCII number of given character
            if(n>=65 && n<=90) {
                result = result + strRevCaps.charAt(str.charAt(i) - 'A');
            }
            else if(n>=97 && n<=122) {
                result = result + strRevSmall.charAt(str.charAt(i) - 'a');
            }
            else {
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);
    }
}


//Program-2
import java.util.Scanner;

public class MirrorImage_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        mirror(str);
    }
    public static void mirror(String str) {
        //ASCII -- 65(A) to 90(Z)  &&  97(a) to 122(z)
        //char[] ch = str.toCharArray();
        String result = "";
        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            int a = (int)c;//    --------------------- int a --> will store the ASCII number of given character
            if(a>=65 && a<=90) {
                int b = 155-a;//   -------------------  65(A) + 90(Z) = 155
                result = result + (char)b;
            }
            else if(a>=97 && a<=122) {
                int b = 219-a;//   --------------------   97(a) + 122(z) = 219
                result = result + (char)b;
            }
            else {
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);
    }
}

