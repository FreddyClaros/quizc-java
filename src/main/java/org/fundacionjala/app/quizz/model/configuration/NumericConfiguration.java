package org.fundacionjala.app.quizz.model.configuration;

import static org.fundacionjala.app.quizz.model.configuration.DateConfiguration.FORMATTER;
import org.fundacionjala.app.quizz.model.validator.ValidatorType;

public class NumericConfiguration extends QuestionConfiguration {
    public NumericConfiguration() {
        super(false, ValidatorType.REQUIRED, ValidatorType.MIN_LENGTH, ValidatorType.MAX_LENGTH);
    }
    
    @Override
    public String convertValue(String value) {
        if(isNumeric(value)){
            return ""+Integer.parseInt(value);
        }else{
            return "The value is not numeric";
        }
    }
    private static boolean isNumeric(String cadena){
	try {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
    }
}
