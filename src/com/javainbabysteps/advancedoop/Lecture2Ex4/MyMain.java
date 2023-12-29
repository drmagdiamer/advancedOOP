package com.javainbabysteps.advancedoop.Lecture2Ex4;

public class MyMain {
    public static void main(String[] args) {
        MemberRelationship m1 = MemberRelationship.WIFE;
        MemberRelationship m2 = MemberRelationship.DAUGHTER;
        MemberRelationship m3 = MemberRelationship.DAUGHTER;

        m3.setId(7);

        System.out.println(m2);
    }
}
