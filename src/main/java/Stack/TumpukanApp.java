package Stack;
public class TumpukanApp {
   public static void main(String[] args) {
        Tumpukan tumpukan = new Tumpukan(10);
        tumpukan.push(6);
        tumpukan.baca();
        tumpukan.push(2);
        tumpukan.baca();
        tumpukan.push(3);
        tumpukan.baca();
        long bacaTop1 = tumpukan.peek();
        System.out.println("nilai teratas = "+bacaTop1);
        System.out.println("Nama saya adalah Deni Saputra");
        long bacaTop2 = tumpukan.peek();
        System.out.println("nilai yang di hapus = "+bacaTop2);
        tumpukan.pop();
        tumpukan.baca();
        tumpukan.push(4);
        tumpukan.baca();
    }    
}
