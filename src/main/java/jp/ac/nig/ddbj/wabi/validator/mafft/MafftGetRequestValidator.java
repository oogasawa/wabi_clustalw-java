package jp.ac.nig.ddbj.wabi.validator.mafft;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import jp.ac.nig.ddbj.wabi.request.WabiGetRequest;
import jp.ac.nig.ddbj.wabi.validator.WabiGetRequestValidator;

/**
 * GET リクエストされた BLAST入力データ の妥当性を検証します.
 */
public class MafftGetRequestValidator extends WabiGetRequestValidator {
	public boolean supports(Class clazz) {
		return WabiGetRequest.class.isAssignableFrom(clazz);
	}

	/**
	 * GET "/blast/{id}" リクエストの入力値を検証します。
	 */
	public void validate(Object target, Errors errors) {
		super.validate(target, errors);
		MafftRequestValidationUtil.validateRequestId(request.getRequestId(), errors);
	}
}
