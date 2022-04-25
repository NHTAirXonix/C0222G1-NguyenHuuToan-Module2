package _19_string_regex.excercise.validate_class_name;

public class ValidateClassNameTest {
    public static final String[] validClassName = new String[]{"C0318G", "C0244G", "C0999G"};
    public static final String[] invalidClassName = new String[]{"M0318G", "P0323A","G3322S"};

    public static void main(String[] args) {
        ValidateClassName validateClassName = new ValidateClassName();
        for (String classname : validClassName) {
            boolean isvalid = validateClassName.validateClassName(classname);
            System.out.println("Classname is " + classname + " is valid: " + isvalid);
        }
        for (String classname : invalidClassName) {
            boolean isvalid = validateClassName.validateClassName(classname);
            System.out.println("Classname is " + classname + " is valid: " + isvalid);
        }
    }
}
