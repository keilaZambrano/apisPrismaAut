package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class ResponseEresumen {
	private String accountNumber;
	private String bankCode;
	private String closeDateSince;
	private String wallet;
	private String id;
	private String keyValue;
	private String statementType;

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setCloseDateSince(String closeDateSince) {
		this.closeDateSince = closeDateSince;
	}

	public String getCloseDateSince() {
		return closeDateSince;
	}

	public void setWallet(String wallet) {
		this.wallet = wallet;
	}

	public String getWallet() {
		return wallet;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setKeyValue(String keyValue) {
		this.keyValue = keyValue;
	}

	public String getKeyValue() {
		return keyValue;
	}

	public void setStatementType(String statementType) {
		this.statementType = statementType;
	}

	public String getStatementType() {
		return statementType;
	}


}