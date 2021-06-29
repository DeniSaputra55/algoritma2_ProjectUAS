package Queue;
public class AntrianApp {
  public static void main(String[] args){
                Antrian antrian = new Antrian(10);
                antrian.enqueue(6);
                antrian.display();
                antrian.enqueue(8);
                antrian.display();
                System.out.println("yang diambil dari antrian =" + antrian.dequeue());
                
                System.out.println("Nama saya adalah Deni Saputra");
                antrian.display();
                antrian.enqueue(7);
                antrian.display();
                antrian.enqueue(6);
                antrian.display();
                System.out.println(" nilai paling depan = " + antrian.peek());
   }            
}
