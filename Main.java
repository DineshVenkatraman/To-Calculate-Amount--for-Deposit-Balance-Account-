public class Main {
    public static void main(String[] args) {
        AccountRealProj a1=new AccountRealProj();
        a1.insert(832345,"Ankit",1000);
        a1.display();
        a1.checkBalance();
        a1.deposit(40000);
        a1.checkBalance();
        a1.withdraw(15000);
        a1.checkBalance();
    }
}