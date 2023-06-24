package Others.java.objetos;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Optional;

public class PurchaseItem {
	
	private Long purchaseItemId;
	private Long purchaseId;
	private BigDecimal initialAmount;
    private LocalDate dueDate;
    private LocalDate paymentDate;
    private BigDecimal paidAmount;
    
	public PurchaseItem(Long purchaseItemId, Long purchaseId,BigDecimal initialAmount, LocalDate dueDate, LocalDate paymentDate,
			BigDecimal paidAmount) {
		this.purchaseItemId = purchaseItemId;
		this.purchaseId = purchaseId;
		this.initialAmount = initialAmount;
		this.dueDate = dueDate;
		this.paymentDate = paymentDate;
		this.paidAmount = paidAmount;
	}

	public Long getPurchaseItemId() {
		return purchaseItemId;
	}

	public void setPurchaseItemId(Long purchaseItemId) {
		this.purchaseItemId = purchaseItemId;
	}
	
	public Long getPurchaseId() {
		return purchaseId;
	}
	
	public void setPurchaseId(Long purchaseId) {
		this.purchaseId = purchaseId;
	}

	public BigDecimal getInitialAmount() {
		return initialAmount;
	}

	public void setInitialAmount(BigDecimal initialAmount) {
		this.initialAmount = initialAmount;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public LocalDate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}

	public BigDecimal getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(BigDecimal paidAmount) {
		this.paidAmount = paidAmount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(purchaseItemId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PurchaseItem other = (PurchaseItem) obj;
		return Objects.equals(purchaseItemId, other.purchaseItemId);
	}

	@Override
	public String toString() {
		return "PurchaseItem [purchaseItemId=" + purchaseItemId + ", initialAmount=" + initialAmount + ", dueDate="
				+ dueDate + ", paymentDate=" + paymentDate + ", paidAmount=" + paidAmount + "]";
	}
	
	
	
	
    
    


}
