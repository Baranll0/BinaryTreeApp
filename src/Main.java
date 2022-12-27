import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Node root=null;
        BinaryTREE node=new BinaryTREE();
        Scanner scanner=new Scanner(System.in);
        int sayi=0;
        int n,y;
        while(sayi!=-1) {
            System.out.println("\n1.Root ekleme");
            System.out.println("2.Ekleme");
            System.out.println("3.Silme");
            System.out.println("4.Yazdırma");
            System.out.println("5.Cikis");
            sayi=scanner.nextInt();

            switch (sayi) {
                case 1:
                    System.out.println("Root degeri giriniz");
                    n = scanner.nextInt();
                    root = node.ekle(root, n);
                    break;
                case 2:
                    System.out.println("Eklemek istediğiniz degeri giriniz");
                    n = scanner.nextInt();
                    root = node.ekle(root, n);
                    break;
                case 3:
                    System.out.println("Silmek istedginiz değeri giriniz");
                    n = scanner.nextInt();
                    root = node.silme(root, n);
                    break;
                case 4:
                    System.out.println("yazdir");
                    node.inOrder(root);
                    break;
                case 5:
                    return;

            }
        }
    }
}