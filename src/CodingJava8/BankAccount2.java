package CodingJava8;

public class BankAccount2 {

    private int balance;

    public BankAccount2(int balance){
        this.balance=balance;
    }

    public void withdraw(int amount) {
        try{
            if(amount>balance){
                throw new ValidationException();
            }
        }catch(ValidationException e){
            balance-=amount;
        }catch (Exception e){

        }
    }

}
