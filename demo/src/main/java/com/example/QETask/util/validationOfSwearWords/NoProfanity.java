package com.example.QETask.util.validationOfSwearWords;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = ProfanityValidator.class)
@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface NoProfanity {
    String message() default "Текст содержит нецензурную лексику";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
