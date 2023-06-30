package Others.java.objetos;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Purchase {
	
	private Long purchaseId;
	private String description;
    private BigDecimal totalValue;
    private LocalDate purchaseDate;
    private Integer totalInstallments;
    private BigDecimal interest;
    
    public Purchase() {
    	
    }
    
	public Purchase(Long purchaseId, String description, BigDecimal totalValue, LocalDate purchaseDate,
			Integer totalInstallments, BigDecimal interest) {
		this.purchaseId = purchaseId;
		this.description = description;
		this.totalValue = totalValue;
		this.purchaseDate = purchaseDate;
		this.totalInstallments = totalInstallments;
		this.interest = interest;
	}

	public Long getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(Long purchaseId) {
		this.purchaseId = purchaseId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(BigDecimal totalValue) {
		this.totalValue = totalValue;
	}

	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Integer getTotalInstallments() {
		return totalInstallments;
	}

	public void setTotalInstallments(Integer totalInstallments) {
		this.totalInstallments = totalInstallments;
	}

	public BigDecimal getInterest() {
		return interest;
	}

	public void setInterest(BigDecimal interest) {
		this.interest = interest;
	}

	@Override
	public int hashCode() {
		return Objects.hash(purchaseId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Purchase other = (Purchase) obj;
		return Objects.equals(purchaseId, other.purchaseId);
	}

	@Override
	public String toString() {
		return "Purchase [purchaseId=" + purchaseId + ", description=" + description + ", totalValue=" + totalValue
				+ ", purchaseDate=" + purchaseDate + ", totalInstallments=" + totalInstallments + ", interest="
				+ interest + "]";
	}
	
	
	
    
    

}
