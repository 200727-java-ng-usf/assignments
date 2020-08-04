package QuestionEleven;

import QuestionElevenOtherPackage.QuestionElevenOtherPackageClass;

public class QuestionEleven {

    public static void main(String[] args) {

        System.out.println("A float from another package: " + QuestionElevenOtherPackageClass.getFloat1());
        System.out.println("Another float from the same package as the other float: " + QuestionElevenOtherPackageClass.getFloat2());

    }

} // done
