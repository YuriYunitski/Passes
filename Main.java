import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        FileOutputStream f = new FileOutputStream("C:\\Users\\Admin\\Desktop\\pwd\\pwd.txt", true);
        int length = Main.leng();
        for (int i = 0; i < length; i++){
            int ra = Main.ran();
            if (ra < 4){
                char c = Main.lowChar();
                f.write(c);
            }
            else if (ra >= 4 && ra < 8){
                char c1 = Main.upChar();
                f.write(c1);
            }
            else if (ra >= 8 && ra < 12){
                char c2 = Main.sim();
                f.write(c2);
            }
            else{
                char c3 = Main.num();
                f.write(c3);
            }
        }
        char a = 10;
        f.write(a);
        f.close();
    }
    public static int leng(){
        int l = (int)(Math.random()*10)+28;
        return l;
    }
    public static char lowChar(){
        char c = (char)((Math.random()*26)+97);
        return c;
    }
    public static char upChar(){
        char c = (char)((Math.random()*26)+65);
        return c;
    }
    public static char sim(){
        char c = (char)((Math.random()*15)+33);
        return c;
    }
    public static char num(){
        char c = (char)((Math.random()*11)+48);
        return c;
    }
    public static int ran(){
        int i = (int)(Math.random()*17);
        return i;
    }
}