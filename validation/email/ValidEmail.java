@Target({TYPE, FIELD, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = EmailValidator.class)
@Documented
public @interface ValidEmail {
    String massage() default "Invalid email";

    Class<?>[] group() default {};

    Class<? extends Payload>[] payload() default {};
}