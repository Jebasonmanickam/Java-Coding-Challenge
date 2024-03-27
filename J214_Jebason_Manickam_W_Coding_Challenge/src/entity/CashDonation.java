package entity;
import java.util.Date;

class CashDonation extends Donation {
    private Date donationDate;

    public CashDonation(String donorName, double amount, Date donationDate) {
        super(donorName, amount);
        this.donationDate = donationDate;
    }

    // Implementation of RecordDonation()
    @Override
    public void recordDonation() {
        // Implement recording of cash donation
    }
}