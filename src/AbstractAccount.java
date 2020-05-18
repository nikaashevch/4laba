public abstract class AbstractAccount implements Account, Cloneable{
    private String number;
    private double balance;

    public static final String EMPTY_STRING = "";

    protected AbstractAccount() {
        this(EMPTY_STRING,0);
    }

    protected AbstractAccount(String number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean checkNumber(String number){
        return this.number.equals(number);
    }

    @Override
    public String toString() {
        return String.format("number: %s balance: %d",number,balance);
    }

    @Override
    public int hashCode(){
        return number.hashCode() * (int) balance;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        AbstractAccount that = (AbstractAccount) obj;
        return balance == that.getBalance() &&
                number.equals(that.getNumber());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
