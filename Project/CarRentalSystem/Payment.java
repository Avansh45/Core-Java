package Project.CarRentalSystem;

class Payment {
    private String paymentId;
    private double amount;
    private String method;

    public Payment(String paymentId, double amount, String method) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.method = method;
    }

    
    public String getPaymentId() { 
        return paymentId; 
    }
    public double getAmount() { 
        return amount; 
    }
    public String getMethod() { 
        return method; 
    }

    @Override
    public String toString() {
        return String.format("Payment %s: %.2f via %s", 
                paymentId, amount, method);
    }
}