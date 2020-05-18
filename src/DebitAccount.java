public class DebitAccount extends AbstractAccount implements Account,Cloneable{

    public DebitAccount() {
        super();
    }

    public DebitAccount(String number, double balance) {
        super(number,balance);
    }

    @Override
    public String toString() {
        return "Debit account - " + super.toString();
    }

    @Override
    public int hashCode(){
        return 53 * super.hashCode();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
