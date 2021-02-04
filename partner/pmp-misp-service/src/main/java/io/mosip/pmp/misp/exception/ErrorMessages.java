package io.mosip.pmp.misp.exception;

/**
 * <p> This enum contains all the error messages with codes.</p>
 * 
 * @author Nagarjuna Kuchi
 * @version 1.0
 */
public enum ErrorMessages {
	
	MISP_EXISTS("PMS_MSP_402","MISP already registred with name :"),
	INTERNAL_SERVER_ERROR("PMS_COR_003","Could not process the request"),
	MISSING_INPUT_PARAMETER("PMS_COR_001","Missing Input Parameter - "),
	INVALID_INPUT_PARAMETER("PMS_COR_002","Invalid Input Parameter - "),
	MISP_ID_NOT_EXISTS("PMS_MSP_005","MISP ID does not exist"),
	MISP_LICENSE_KEY_NOT_EXISTS("PMS_MSP_406","MISP License Key does not exists"),
	MISP_LICENSE_KEY_NOT_ASSOCIATED_MISP_ID("PMS_MSP_408","MISP License key not associated to MISP ID"),
	NO_MISP_DETAILS("PMS_MSP_409", "No MISP details found"),
	MISP_IS_INACTIVE("PMS_MSP_405", "Misp is not active."),
	MISP_STATUS_CHENAGE_REQUEST_EXCEPTION("PMS_MSP_404", "Misp already "),
	STATUS_CODE_EXCEPTION("PMS_MSP_403","mispStatus either approved or rejected."),
	MISP_STATUS_CODE_EXCEPTION("PMS_MSP_407","mispStatus either Active or De-active."),
	MISP_LICENSE_KEY_STATUS_EXCEPTION("PMS_MSP_418","mispLicenseKeyStatus either Active or De-active."),
	MISP_LICENSE_EXPIRED_NOT_ACTIVATE("PMS_MSP_419","misp license is expired.Cannot activate the same."),
	MISP_NOT_APPROVED("PMS_MSP_419","misp is not yet approved."),
	MISP_LICENSE_ARE_NOT_ACTIVE("PMS_MSP_413","misp license all are inactive."),
	MISPID_FETCH_EXCEPTION("PMP-MSP-001", "Error Occur While Fetching Id"),
	MISPID_INSERTION_EXCEPTION("PMP-MSP-002", "Error Occur While Inserting Id"),
	INVALID_EMAIL_ID_EXCEPTION("PMS_MSP_401","Invalid email id.");


private final String errorCode;
private final String errorMessage;

/**
 * 
 * @param errorCode
 * @param errorMessage
 */
private ErrorMessages(final String errorCode, final String errorMessage) {
	this.errorCode = errorCode;
	this.errorMessage = errorMessage;
}

/**
 * This method bring the error code.
 * @return string 
 */
public String getErrorCode() {
	return errorCode;
}

/**
 * This method brings the error message.
 * @return string 
 */
public String getErrorMessage() {
	return errorMessage;
}
}	
