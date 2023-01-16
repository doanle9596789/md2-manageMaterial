import java.time.LocalDate;

public class CrispyFlour extends Material {
    private  int quantity;
    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost,int quantity){
        super(id, name, manufacturingDate, cost);
     this.quantity=quantity;
    }

    public CrispyFlour() {
    }


    @Override
    public double getAmount() {
        return quantity*cost;
    }

    @Override
    public LocalDate getExpiryDate() {
        return manufacturingDate.plusYears(1);
    }

    @Override
    public String toString() {
        return "CrispyFlour{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", manufacturingDate=" + manufacturingDate +
                ", cost=" + cost +
                ", quantity=" + quantity +
                '}';
    }
}
