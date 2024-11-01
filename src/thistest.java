class account {
    int rate;
    int amount;
    int interest;
    account(int r, int a){
        rate = r;
        amount = a;
    }
    void Total_Interest(){
        int rate =5;
        rate = this.rate+rate; //use of this keyword
        interest = rate * amount/100;
        System.out.println("Total Interest on amount " + amount + " is " + interest);
    }
}
public class thistest{
    public static void main(String[] args){
        account account1 = new account(5,5000);
        account1.Total_Interest();

    }
}

