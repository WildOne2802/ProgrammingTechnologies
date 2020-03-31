package FirstLab.Third;

public class Cycles {
    public static void main(String[] args) {
        char v_char = 'a';
        for (int i=0;i<26; i++){
            System.out.print(v_char + " ");
            v_char++;

        }
        System.out.println();

        for(char x ='a'; x!='z';x++)
            System.out.println(x);
    }
}
