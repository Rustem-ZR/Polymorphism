package taxes;


public class Main {
    public static void main(String[] args) {
        Company company = new Company("Lukoil", new TaxSystemSIx());

        company.shiftMoney(200);
        company.shiftMoney(-100);
        company.payTaxes();

        company.setTaxSystem(new TaxSystemFifteen());
        company.shiftMoney(400);
        company.shiftMoney(400);
        company.shiftMoney(-400);
        company.payTaxes();

    }

}
