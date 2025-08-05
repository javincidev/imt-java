package Enum;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Random;
import java.util.Stack;

@Retention(RetentionPolicy.CLASS)
@interface MyAnnotation {
    String str();
    int value();
}
enum Answers {
    NO, YES, MAYBE, LATER, SOON, NEVER
}
class Question {
    Random rand = new Random();
    Answers ask (){
        int prob = (int) (100 * rand.nextDouble());

        if (prob < 15)
            return Answers.MAYBE;
        if (prob < 30)
            return Answers.NO;
        else if (prob < 60)
            return Answers.YES;
        else if (prob < 75)
            return Answers.LATER;
        else if (prob < 98)
            return Answers.SOON;
        else
            return Answers.NEVER;
    };

}

class AskMe {
    @MyAnnotation(str = "23232", value = 1)
    static void answer(Answers result) {
        switch (result) {
            case NO:
                System.out.println("Нет");
                break;
            case YES:
                System.out.println("Да");
                break;
            case MAYBE:
                System.out.println("Возможно");
                break;
            case LATER:
                System.out.println("Позднее");
                break;
            case SOON:
                System.out.println("Вскоре");
                break;
            case NEVER:
                System.out.println("Никогда");
                break;
        }
    }

    public static void main(String[] args) {
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());

        Double a, b, c;
        a = 200.0;
        b = 500.0;
        c = Math.sqrt(a*a + b*b);
        System.out.println(c);
    }
}
