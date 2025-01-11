package com.example.QETask.util.validationOfSwearWords;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.ArrayList;
import java.util.Arrays;

public class ProfanityValidator implements ConstraintValidator<NoProfanity, String> {

    // Список матерных слов (пример)
    private static final ArrayList<String> PROFANITY_LIST = (ArrayList<String>) Arrays.asList(
            "матерное_слово1",
            "матерное_слово2",
            "матерное_слово3"
            // Можем добавить сюда все матерные слова
    );

    @Override
    public boolean isValid(String text, ConstraintValidatorContext context) {
        return PROFANITY_LIST.stream().noneMatch(text::contains);
    }
}