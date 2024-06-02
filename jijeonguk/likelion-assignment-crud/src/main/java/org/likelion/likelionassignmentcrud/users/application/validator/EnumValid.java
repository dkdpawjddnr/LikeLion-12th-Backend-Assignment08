package org.likelion.likelionassignmentcrud.users.application.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
@Documented
@Constraint(validatedBy = EnumValidator.class)
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE})
@Retention(RUNTIME)
public @interface EnumValid {
    String message() default "KAKAO나 NAVER로 작성해주세요. ";

    Class<?>[] groups() default { };
    Class<? extends Payload>[] paylaod() default { };
    Class<? extends Enum<?>> enumClass();
}