package entity;

class ItemDonation extends Donation {
    private String itemType;

    public ItemDonation(String donorName, double amount, String itemType) {
        super(donorName, amount);
        this.itemType = itemType;
    }

    // Implementation of RecordDonation()
    @Override
    public void recordDonation() {
        // Implement recording of item donation
    }
}