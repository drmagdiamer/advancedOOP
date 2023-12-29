package com.javainbabysteps.advancedoop.Lecture2Ex4;

public enum MemberRelationship {
    WIFE(1), HUSBAND(2), DAUGHTER(3), SON(4);

    private final int id;

    private MemberRelationship(int id) {
        this.id = id;
    }


    public int getId() {
        return id;
    }

    public static MemberRelationship getMemberRelationship(int id){
        switch (id){
            case 1:
                return WIFE;
            case 2:
                return HUSBAND;
            case 3:
                return DAUGHTER;
            case 4:
                return SON;
            default:
                return null;
        }
    }

    @Override
    public String toString() {
        return "MemberRelationship{" +
                "name is "+this.name()+
                " and id = " + id +
                '}';
    }
}
