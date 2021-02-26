package ujibuss3;

/**
 *
 * @author Yuliana
 */
public class UjiBuss3 {

    public static void main(String[] args) {
        Buss3 Bus = new Buss3(5);
        Bus.getpenumpang(17);
        Bus.getpenumpang(24);
        Bus.cetakpenumpang();
        
        //penambahan penumpang
        Bus.addpenumpang(2); //tambah 2 penumpang
        Bus.cetakpenumpang();
        
        //penambahan penumpang
        Bus.addpenumpang(1); //tambah 1 penumpang
        Bus.cetakpenumpang();
        
        //penambahan penumpang
        Bus.addpenumpang(2); //tambah 2 penumpang
        Bus.cetakpenumpang();
        
        //penambahan penumpang
        Bus.addpenumpang(2); //tambah 2 penumpang
        Bus.cetakpenumpang();
        
        Bus.getAverage();
    }
    
}
