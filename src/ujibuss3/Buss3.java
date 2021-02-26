package ujibuss3;

import java.util.Scanner;

/**
 *
 * @author Yuliana
 */
public class Buss3 {
    //mendeklarasikan variabel akses modifier public
    public int penumpang;
    public int maxpenumpang;
    
    //konstruktor kelas Buas
    public Buss3(int maxpenumpang){
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }

    //method mutator untuk menambahkan penumpang
    public void addpenumpang(int penumpang){
        int temp;
        temp = this.penumpang + penumpang;
        if(temp > maxpenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else{
            this.penumpang = temp;
        }
    }
    public void getpenumpang(int password){
        if (password == 24){
            System.out.println("Password Benar");
        }else{
            System.out.println("Password Salah");
        }
    }
    //method void cetakpenumpang untuk menampilkan jumlah penumpang sekarang dan maksimal penumpang
    public void cetakpenumpang(){
        System.out.println("Penumpang Bus Sekarang = "+ penumpang);
        System.out.println("Maksimun penumpang yang seharusnya adalah "+maxpenumpang);
    }
    //method untuk menghitung rata-rata berat penumpang
    public void getAverage(){
        System.out.println("");
        //membuat scanner
        Scanner input = new Scanner(System.in);
        int a;
        double jumlah, bb, ratarata;
        jumlah = 0;
        a = 1; //agar user dapat memasukkan berat badan dari penumpang pertama
        //jika a kurang dari sama dengan penumpang maka akan dilakukan perulangan do while
        do {
            System.out.print("Masukkan Berat Badan Penumpang ke- "+a+" : "); //untuk user memasukkan berat penumpang
            bb = input.nextInt();
            jumlah += bb; //menjumlahkan berat badan penumpang semuanya
            a++; //increment untuk mengulangi perulangan sebanyak jumlah penumpang bus
        } while (a<=penumpang);
       
        System.out.println("");
        ratarata = jumlah/penumpang; //rumus dan cara untuk menghitung rata-rata
        System.out.println("Berat Seluruh Penumpang : "+jumlah); //menampilkan jumlah berat seluruh penumpang
        System.out.println("Berat rata-rata         : "+ratarata+"Kg"); //menampilkan berat rata-rata seluruh penumpang
    }
}
