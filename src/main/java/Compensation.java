public class Compensation {
    CompensationType type;
    String inViolationOf;

    public Compensation() {

    }

    public Compensation(CompensationType type) {
        this.type = type;
    }

    public Compensation(CompensationType type, String inViolationOf) {
        this.type = type;
        this.inViolationOf = inViolationOf;
    }
}
