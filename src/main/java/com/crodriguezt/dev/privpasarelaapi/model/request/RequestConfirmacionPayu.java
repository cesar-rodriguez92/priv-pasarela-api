package com.crodriguezt.dev.privpasarelaapi.model.request;

import java.math.BigDecimal;

public class RequestConfirmacionPayu {

	private String merchant_id;
	private String state_pol;
	private String risk;
	private String response_code_pol;
	private String reference_sale;
	private String reference_pol;
	private String sign;
	private String extra1;
	private String extra2;
	private String extra3;
	private String payment_method;
	private String payment_method_type;
	private String installments_number;
	private BigDecimal value;
	private String transaction_date;
	private String currency;
	private String email_buyer;
	private String description;
	private String account_number_ach;
	private String account_type_ach;
	private BigDecimal administrative_fee;
	private int attempts;
	private String date;
	private String authorization_code;
	private String payment_method_id;
	private String payment_request_state;
	private String response_message_pol;
	private String transaction_id;
	private String payment_method_name;

	public String getMerchant_id() {
		return merchant_id;
	}

	public void setMerchant_id(String merchant_id) {
		this.merchant_id = merchant_id;
	}

	public String getState_pol() {
		return state_pol;
	}

	public void setState_pol(String state_pol) {
		this.state_pol = state_pol;
	}

	public String getRisk() {
		return risk;
	}

	public void setRisk(String risk) {
		this.risk = risk;
	}

	public String getResponse_code_pol() {
		return response_code_pol;
	}

	public void setResponse_code_pol(String response_code_pol) {
		this.response_code_pol = response_code_pol;
	}

	public String getReference_sale() {
		return reference_sale;
	}

	public void setReference_sale(String reference_sale) {
		this.reference_sale = reference_sale;
	}

	public String getReference_pol() {
		return reference_pol;
	}

	public void setReference_pol(String reference_pol) {
		this.reference_pol = reference_pol;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getExtra1() {
		return extra1;
	}

	public void setExtra1(String extra1) {
		this.extra1 = extra1;
	}

	public String getExtra2() {
		return extra2;
	}

	public void setExtra2(String extra2) {
		this.extra2 = extra2;
	}

	public String getExtra3() {
		return extra3;
	}

	public void setExtra3(String extra3) {
		this.extra3 = extra3;
	}

	public String getPayment_method() {
		return payment_method;
	}

	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}

	public String getPayment_method_type() {
		return payment_method_type;
	}

	public void setPayment_method_type(String payment_method_type) {
		this.payment_method_type = payment_method_type;
	}

	public String getInstallments_number() {
		return installments_number;
	}

	public void setInstallments_number(String installments_number) {
		this.installments_number = installments_number;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public String getTransaction_date() {
		return transaction_date;
	}

	public void setTransaction_date(String transaction_date) {
		this.transaction_date = transaction_date;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getEmail_buyer() {
		return email_buyer;
	}

	public void setEmail_buyer(String email_buyer) {
		this.email_buyer = email_buyer;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAccount_number_ach() {
		return account_number_ach;
	}

	public void setAccount_number_ach(String account_number_ach) {
		this.account_number_ach = account_number_ach;
	}

	public String getAccount_type_ach() {
		return account_type_ach;
	}

	public void setAccount_type_ach(String account_type_ach) {
		this.account_type_ach = account_type_ach;
	}

	public BigDecimal getAdministrative_fee() {
		return administrative_fee;
	}

	public void setAdministrative_fee(BigDecimal administrative_fee) {
		this.administrative_fee = administrative_fee;
	}

	public int getAttempts() {
		return attempts;
	}

	public void setAttempts(int attempts) {
		this.attempts = attempts;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAuthorization_code() {
		return authorization_code;
	}

	public void setAuthorization_code(String authorization_code) {
		this.authorization_code = authorization_code;
	}

	public String getPayment_method_id() {
		return payment_method_id;
	}

	public void setPayment_method_id(String payment_method_id) {
		this.payment_method_id = payment_method_id;
	}

	public String getPayment_request_state() {
		return payment_request_state;
	}

	public void setPayment_request_state(String payment_request_state) {
		this.payment_request_state = payment_request_state;
	}

	public String getResponse_message_pol() {
		return response_message_pol;
	}

	public void setResponse_message_pol(String response_message_pol) {
		this.response_message_pol = response_message_pol;
	}

	public String getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}

	public String getPayment_method_name() {
		return payment_method_name;
	}

	public void setPayment_method_name(String payment_method_name) {
		this.payment_method_name = payment_method_name;
	}

	@Override
	public String toString() {
		return "RequestConfirmacionPayu [merchant_id=" + merchant_id + ", state_pol=" + state_pol + ", risk=" + risk
				+ ", response_code_pol=" + response_code_pol + ", reference_sale=" + reference_sale + ", reference_pol="
				+ reference_pol + ", sign=" + sign + ", extra1=" + extra1 + ", extra2=" + extra2 + ", extra3=" + extra3
				+ ", payment_method=" + payment_method + ", payment_method_type=" + payment_method_type
				+ ", installments_number=" + installments_number + ", value=" + value + ", transaction_date="
				+ transaction_date + ", currency=" + currency + ", email_buyer=" + email_buyer + ", description="
				+ description + ", account_number_ach=" + account_number_ach + ", account_type_ach=" + account_type_ach
				+ ", administrative_fee=" + administrative_fee + ", attempts=" + attempts + ", date=" + date
				+ ", authorization_code=" + authorization_code + ", payment_method_id=" + payment_method_id
				+ ", payment_request_state=" + payment_request_state + ", response_message_pol=" + response_message_pol
				+ ", transaction_id=" + transaction_id + ", payment_method_name=" + payment_method_name + "]";
	}

}
