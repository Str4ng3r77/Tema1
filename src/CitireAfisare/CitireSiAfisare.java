package CitireAfisare;
import java.util.Scanner;
public class CitireSiAfisare {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Introduceti numele dumneavoastra: ");
        String nume = in.nextLine();
        System.out.println(nume);
        System.out.println("Introduceti varsta dumneavoastra: ");
        int varsta= in.nextInt();
        int[] note = {10, 10, 9, 9, 5};
        System.out.println("Notele pe care le are "+nume+" sunt: ");
        for (int i = 0; i < note.length; i++) {
            if(note[i]<9){
                note[i]=note[i]+2;
            }
            System.out.println(note[i]);
        }
    }
}
