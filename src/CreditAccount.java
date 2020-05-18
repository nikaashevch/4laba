public class CreditAccount extends AbstractAccount implements Credit,Cloneable{
    private double APR;

    public static final double DEFAULT_APR = 30;

    public CreditAccount(){
        super();
        this.APR = DEFAULT_APR;
    }

    public CreditAccount(String number, double balance, double APR){
        super(number,balance);
        setAPR(APR);
    }

    @Override
    public double getAPR() {
        return APR;
    }

    @Override
    public void setAPR(double APR) {
        this.APR = APR;
    }

    @Override
    public String toString() {
        return "Credit account - " + super.toString() + " APR: " +APR;
    }

    @Override
    public int hashCode(){
        return 71 * super.hashCode() + (int) APR;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        CreditAccount that = (CreditAccount) obj;
        return APR == that.APR;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
