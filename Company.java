package taxes;

public class Company {

    String title;
    int debit;
    int credit;
    TaxSystem taxSystem;

    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit += amount;
        }
        if (amount < 0) {
            credit += Math.abs(amount);
        } else {
            System.out.println(" ");
        }
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void payTaxes() {
        int tax = taxSystem.calcTaxFor(debit, credit);
        System.out.println(" Компания " + title + " уплатила налог в размере: " + tax + " руб. ");
        debit = 0;
        credit = 0;
    }
}
