package entity;

abstract class Donation {
    private String donorName;
    private double amount;

    public Donation(String donorName, double amount) {
        this.donorName = donorName;
        this.amount = amount;
    }

    // Abstract method RecordDonation()
    public abstract void recordDonation();
}