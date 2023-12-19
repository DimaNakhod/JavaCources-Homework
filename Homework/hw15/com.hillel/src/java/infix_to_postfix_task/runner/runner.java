package infix_to_postfix_task.runner;

import infix_to_postfix_task.recordingForm.PostfixFormConverter;

public class runner {
    public static void main(String[] args) {
        String str = "10/5+5*(2+3)";
        PostfixFormConverter pc = new PostfixFormConverter();
        System.out.println(pc.changeInfixToPostfix(str));


    }
}
