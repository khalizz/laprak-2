class BankAccount{
    String noRek, namaPemilik;
    double saldo;

    BankAccount(String noRek, String namaPemilik, double saldo){
        this.noRek = noRek;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }
    BankAccount(String noRek, String namaPemilik){
        this.noRek = noRek;
        this.namaPemilik = namaPemilik;
        this.saldo = 0.0;
    }
    public void DisplayInfo(){
        System.out.println("No Rekening : " + this.noRek );
        System.out.println("Nama Pemilik : " + this.namaPemilik );
        System.out.println("Saldo : " + this.saldo );
    }
    public void Deposit(double saldo){
        if (this.saldo <= 0){
            System.out.println("Saldo tidak boleh kurang dari 0");
        } else {
            this.saldo += saldo;
            System.out.println("Saldo berhasil diupdate, sebanyak : " + this.saldo );
        }
    }
    public void withdraw(double amount){
        if (amount <= this.saldo){
            System.out.println("Pengambilan berhasil senilai : " + amount  );
        }else{
            System.out.println("Saldo tidak mencukupi");
        }
        if (amount < 0){
            System.out.println("Pengambilan gagal karena jumlah yang diambil tidak boleh kurang dari 0");
        }
    }
}

public class Main {
    public static void main(String[] args) {
            BankAccount account = new BankAccount("085282241", "subur", 1000.0);
            BankAccount account2 = new BankAccount("1000", "narji");

            account.DisplayInfo();
            
            System.out.println();
            
            account2.DisplayInfo();

            System.out.println();

            account.withdraw(100000);
            account.Deposit(10000.000);

            System.out.println();

            account2.withdraw(5000.0000);
            account2.Deposit(50000.000);
    }

}