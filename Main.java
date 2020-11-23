
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /*while(döngü koşulu){
        //koşul doğru olduğu sürece çalışır...
        
        
        }
        while ve for döngüleri farklı yapılardır.
        while içinde bir değişken kullanacaksan döngüye gelmeden bu tanıtma işlemini gerçekleştirmiş olman gerekmektedir.
        döngü koşulumuz True olduğu sürece yapımız çalışıyor
        for döngüsü sonsuz döngü olayının çok karşılaşldığı bir yapı değilken
        while döngüsü bu konuda hata yapmaya aha müsait bir yöntemdir.
        for da döngü değişkenimizi döngü üçünde arttırebiliyor ve azaltabiliyoruz.
        while da bunu bizim yapmamız gerekiyor unutr yada eksik bırakırsak sonsuz döngü olur
        sonsuz döngülü işlemler yapılacaksa (kasten) en uygun yapı while döngüsüdür 
        Örnek vermek gerekirse atm projesi yapcaksanız.
        
        */
        int i = 0;
        while(i<=10){
            System.out.println("i değerimiz" +i);
            i++;//eğer bu satırı yapmazsak sonsuz döngü ile karşılaşırız...
            
        }
        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
        //bir başka örnek = 
        int a = 10;
        while(a <100){
            System.out.println("a = "+a);
            a+=4;
        }
        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
        int b = 50000;
        while(b>=0){
        System.out.println("b ifademiz = "+b);
        b-=58;
        }
        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");

        Scanner scn = new Scanner(System.in);
        System.out.println("bir sayı giriniz : ");
        int sayı = scn.nextInt();
        int faktoriyel = 1;
        while(sayı>0){
            faktoriyel*=sayı;
            sayı--;
        }
        System.out.println("faktoriyel sonucumuz = "+faktoriyel);
    /*
        sonsuz döngü ne anlama gelir ???
        bir döngünün hiçbir zaman bitmemesi demek(Koşulun herzaman True olması demek
        bu drumlarda programımız kitlenir bir sonraki aşamaya geçemez ve program tamamlanamaz
        */
    //bir sonsuz döngü öreni = 
    int k = 0;
    while(k<10){
        System.out.println("i = "+k);
        //burada arttrırma yada azaltma yaparak koşulu güncellememiz gerekirken yapmıyoruz
        //k++;(yapılması gereken buydu)
    }
    
    }
}
