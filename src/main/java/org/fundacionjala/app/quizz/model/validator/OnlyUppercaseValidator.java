package org.fundacionjala.app.quizz.model.validator;

import java.text.ParseException;
import java.util.List;

import org.fundacionjala.app.quizz.model.configuration.DateConfiguration;

public class OnlyUppercaseValidator implements Validator {

    private static final String ERROR_MESSAGE = "The format is invalid, it should have only uppercase text";

    @Override
    public void validate(String value, String conditionValue, List<String> errors) {
        value.toUpperCase();
    }
}
